package team.cms.repository;

import lombok.AllArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import team.cms.entity.User;

@Mapper
@Repository
public interface UserRepository {
    User getUserByAccountId(int accountId);

    User getUserByName(String name);

    void addUser(User user);

    void removeByName(String name);

    void updateUser();
}
