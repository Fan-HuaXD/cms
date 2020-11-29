package team.cms.service;

import team.cms.entity.User;

public interface UserService {

    User getUserByAccountId(int accountId);

    void addUser(User user);
}
