package team.cms.repository;

import team.cms.entity.Driver;

public interface DriverRepository {
    Driver getDriverByAccountId(int accountId);

}
