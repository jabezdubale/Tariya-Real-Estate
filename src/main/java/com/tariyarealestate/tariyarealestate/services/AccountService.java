package com.tariyarealestate.tariyarealestate.services;

import com.tariyarealestate.tariyarealestate.domains.Account;
import com.tariyarealestate.tariyarealestate.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;
    public Account createAccount (Account account){

        return accountRepository.save(account);
    }
}
