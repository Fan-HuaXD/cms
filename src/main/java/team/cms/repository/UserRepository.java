package team.cms.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import team.cms.entity.User;

@Mapper
@Repository
public interface UserRepository {

    void addUser(User user);

    User getUserByAccountId(int accountId);

}
