package team.cms.service.impl;

import org.springframework.stereotype.Service;
import team.cms.entity.Driver;
import team.cms.repository.DriverRepository;
import team.cms.service.DriverService;

import javax.annotation.Resource;

@Service
public class DriverServiceImpl implements DriverService {

    @Resource
    DriverRepository driverRepository;

    @Override
    public Driver getDriverByAccountId(int accountId){
        return driverRepository.getDriverByAccountId(accountId);
    }
}
