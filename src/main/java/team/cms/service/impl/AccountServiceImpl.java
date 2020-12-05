package team.cms.service.impl;

import org.springframework.stereotype.Service;
import team.cms.entity.Account;
import team.cms.repository.AccountRepository;
import team.cms.service.AccountService;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    AccountRepository accountRepository;

    @Override
    public Account getAccountByUsername(String username) {
        return accountRepository.getAccountByUsername(username);
    }

    @Override
    public boolean usernameAvailable(String username) {
        Account account = getAccountByUsername(username);
        if(account == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void addAccount(Account account) {
        accountRepository.addAccount(account);
    }
}
