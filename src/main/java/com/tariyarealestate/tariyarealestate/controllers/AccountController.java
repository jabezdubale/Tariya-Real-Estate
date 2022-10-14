package com.tariyarealestate.tariyarealestate.controllers;

import com.tariyarealestate.tariyarealestate.domains.Account;
import com.tariyarealestate.tariyarealestate.dto.AccountDelete;
import com.tariyarealestate.tariyarealestate.dto.AccountEditor;
import com.tariyarealestate.tariyarealestate.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private Account account;

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

    @PostMapping("/api/account/edit")
    public Account editAccount(@RequestBody AccountEditor accountEditor) throws Exception {
        return accountService.editAccount(accountEditor);
    }

    @PostMapping("/api/account/delete")
    public void deleteAccount(@RequestBody AccountDelete acDelete) throws Exception {
        accountService.deleteAccount(acDelete);
    }

}
