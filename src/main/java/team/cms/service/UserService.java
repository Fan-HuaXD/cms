package team.cms.service;

import org.graalvm.compiler.lir.LIRInstruction;
import team.cms.entity.User;

public interface UserService {

    User getUserByAccountId(int accountId);
}
