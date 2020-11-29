package team.cms.service.impl;

import org.springframework.stereotype.Service;
import team.cms.entity.User;
import team.cms.repository.UserRepository;
import team.cms.service.UserService;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserRepository userRepository;

    @Override
    public User getUserByAccountId(int accountId) {
        return userRepository.getUserByAccountId(accountId);
    }

    @Override
    public void addUser(User user) {
        userRepository.addUser(user);
    }
}
