package team.cms.service.impl;

import team.cms.entity.Account;
import team.cms.repository.AccountRepository;
import team.cms.service.AccountService;

import javax.annotation.Resource;

public class AccoutServiceImpl implements AccountService {

    @Resource
    AccountRepository accountRepository;

    @Override
    public Account getAccountByUsername(String username) {
        return accountRepository.getAccountByName(username);
    }
}
