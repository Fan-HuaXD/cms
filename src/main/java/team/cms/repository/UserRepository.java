package team.cms.repository;

import lombok.AllArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import team.cms.entity.User;

@Mapper
@Repository
public interface UserRepository {
    User getUserByName(String name);

    void add(int acountId,String name,String residentIdNumber,String email,String telephone,
             String workPlace);

    void add(User user);

    void removeByName(String name);

    void updateUser();
}
