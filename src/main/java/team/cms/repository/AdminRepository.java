package team.cms.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import team.cms.entity.Admin;

@Mapper
@Repository
public interface AdminRepository {

    Admin getAdminByAccountId(int accountId);

}
