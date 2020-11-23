package team.cms.repository;

import lombok.AllArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import team.cms.entity.User;

@Mapper
@Repository
public interface UserRepository {
    User getUserByName(String name);
}
