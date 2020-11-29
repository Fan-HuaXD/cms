package team.cms.service.impl;

import team.cms.entity.User;
import team.cms.repository.UserRepository;
import team.cms.service.UserService;

import javax.annotation.Resource;

public class UserServiceImpl implements UserService {

    @Resource
    UserRepository userRepository;

    @Override
    public User getUserByAccountId(int accountId) {
        return userRepository.getUserByAccountId(accountId);
    }
}
