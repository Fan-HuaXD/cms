package team.cms.service;

import team.cms.entity.Account;


public interface AccountService {

    Account getAccountByUsername(String username);

    boolean usernameAvailable(String username);

    void addAccount(Account account);

}
