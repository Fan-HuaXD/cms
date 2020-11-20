package team.cms.service;

import team.cms.entity.User;
import java.util.List;

public interface UserService {

    List<User> getUserList();

    User getUserListByUserName(String userName);

    void addUser(User user);
}
