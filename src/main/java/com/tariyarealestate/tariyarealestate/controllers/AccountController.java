package com.tariyarealestate.tariyarealestate.controllers;

import com.tariyarealestate.tariyarealestate.domains.Account;
import com.tariyarealestate.tariyarealestate.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    @PostMapping("/api/account/create")
    public Account createAccount(@RequestBody Account account){
        return accountService.createAccount(account);
    }

    @GetMapping("/api/account/list")
    public Iterable<Account> showAccount(){
        return accountService.showAccount();
    }

}
