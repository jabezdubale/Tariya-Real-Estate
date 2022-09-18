package com.tariyarealestate.tariyarealestate.services;

import com.tariyarealestate.tariyarealestate.domains.Account;
import com.tariyarealestate.tariyarealestate.dto.AccountEditor;
import com.tariyarealestate.tariyarealestate.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class  AccountService {

    @Autowired
    private AccountRepository accountRepository;
//Creating and showing the main account
    public Account createAccount (Account account){
        return accountRepository.save(account);
    }
    public Iterable<Account> showAccount (){
        return accountRepository.findAll();
    }

//Editing the account
    public Account editAccount(AccountEditor accountEditor) throws Exception {

        Account edittedAccount = accountRepository.findById(accountEditor.getEditorID()).get();

        if (edittedAccount==null){
            throw new Exception();
        }
        if (accountEditor.getEditorName() != null){
            edittedAccount.setFullName(accountEditor.getEditorName());
        }
        if (accountEditor.getEditorPhone() != null){
            edittedAccount.setPhone(accountEditor.getEditorPhone());
        }
        if (accountEditor.getEditorEmail() != null){
            edittedAccount.setEmail(accountEditor.getEditorEmail());
        }
        if (accountEditor.getEditorDOB() != null){
            edittedAccount.setDob(accountEditor.getEditorDOB());
        }
        if (accountEditor.getEditorPermission() != null){
            edittedAccount.setPermission(accountEditor.getEditorPermission());
        }
        if (accountEditor.getEditorPin() != null){
            edittedAccount.setPin(accountEditor.getEditorPin());
        }

        return accountRepository.save(edittedAccount);
    }

}
