package team.cms.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import team.cms.entity.User;

import java.util.List;

@Mapper
@Repository
public interface UserRepository {

    List<User> getUserList();

    User getUserByUserName(String userName);

    void addUser(@Param("user") User user);
}
