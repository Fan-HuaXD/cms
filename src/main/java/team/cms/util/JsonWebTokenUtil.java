package team.cms.util;

import io.jsonwebtoken.*;
import org.bouncycastle.util.encoders.Base64;
import team.cms.entity.Account;
import team.cms.result.JWTParseResult;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Date;

public class JsonWebTokenUtil {

    final static String JWT_SECRET = "NCUCSJAVAWEB";  // 密匙（未加密）

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

    public static JWTParseResult<Account> parseJWT(String jwt) {
        if(jwt == null)
            return new JWTParseResult<Account>(false, "未携带Token或Token为空", null);
        Claims claims = null;
        try {
            SecretKey secretKey = generalKey();
            claims = Jwts.parser()
                    .setSigningKey(secretKey)
                    .parseClaimsJws(jwt)
                    .getBody();
            return new JWTParseResult<Account>(false, "Token解析成功", (Account)claims.get("account"));
        } catch (ExpiredJwtException e) {
            return  new JWTParseResult<Account>(false, "Token已过期", null);
        } catch (Exception e) {
            return new JWTParseResult<Account>(false, "Token非法", null);
        }
    }

    public static SecretKey generalKey() {
        byte[] encodedKey = Base64.decode(JWT_SECRET);
        SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
        return key;
    }
}
