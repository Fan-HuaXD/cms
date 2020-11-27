package team.cms.util;

import io.jsonwebtoken.*;
import org.bouncycastle.util.encoders.Base64;
import team.cms.entity.Account;
import team.cms.result.Result;
import team.cms.result.ResultCode;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Date;

public class JsonWebTokenUtil {

    final static String JWT_SECRET = "NCU-CS-JAVAWEB";  // 密匙（未加密）

    final static long JWT_TTL = 15L * 24L * 3600L * 1000L;

    public static String createJWT(Account account) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        long curMillis = System.currentTimeMillis();
        Date cur = new Date(curMillis);
        SecretKey secretKey = generalKey();
        JwtBuilder builder = Jwts.builder()
                .claim("account", account)
                .setIssuer("server")    // 签发者
                .setIssuedAt(cur)       // 签发时间
                .signWith(signatureAlgorithm, secretKey);   // 签名算法以及密匙
        long expMillis = curMillis + JWT_TTL;
        Date expDate = new Date(expMillis);
        builder.setExpiration(expDate); // 过期时间
        return builder.compact();
    }

    public static Result<Account> parseJWT(String jwt) {
        if(jwt == null)
            return Result.wrapErrorResult(ResultCode.JWT_NEEDED, "未携带Token或Token为空");
        Claims claims = null;
        try {
            SecretKey secretKey = generalKey();
            claims = Jwts.parser()
                    .setSigningKey(secretKey)
                    .parseClaimsJws(jwt)
                    .getBody();
            return Result.wrapSuccessfulResult((Account)claims.get("account"));
        } catch (ExpiredJwtException e) {
            return  Result.wrapErrorResult(ResultCode.JWT_EXPIRED, "Token已过期");
        } catch (Exception e) {
            return Result.wrapErrorResult(ResultCode.JWT_INVALID, "Token不存在");
        }
    }

    public static SecretKey generalKey() {
        byte[] encodedKey = Base64.decode(JWT_SECRET);
        SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
        return key;
    }
}
