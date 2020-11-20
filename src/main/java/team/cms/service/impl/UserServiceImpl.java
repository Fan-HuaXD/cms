package team.cms.service.impl;
import org.springframework.stereotype.Service;
import team.cms.entity.User;
import team.cms.repository.UserRepository;
import team.cms.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.getUserList();
    }

    public User getUserListByUserName(String userName) {
        return userRepository.getUserByUserName(userName);
    }

    public void addUser(User user) {
        userRepository.addUser(user);
    }
}

