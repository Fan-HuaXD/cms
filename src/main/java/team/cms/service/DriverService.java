package team.cms.service;

import org.springframework.stereotype.Service;
import team.cms.entity.Driver;

public interface DriverService {

    Driver getDriverByAccountId(int accountId);
}
