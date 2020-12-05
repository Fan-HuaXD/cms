package team.cms.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import team.cms.entity.Driver;

@Mapper
@Repository
public interface DriverRepository {

    Driver getDriverByAccountId(int accountId);

}
