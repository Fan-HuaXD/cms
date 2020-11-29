package team.cms.service.impl;

import org.springframework.stereotype.Service;
import team.cms.entity.Admin;
import team.cms.repository.AdminRepository;
import team.cms.service.AdminService;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    AdminRepository adminRepository;

    @Override
    public Admin getAdminByAccountId(int accountId) {
        return adminRepository.getAdminByAccountId(accountId);
    }
}
