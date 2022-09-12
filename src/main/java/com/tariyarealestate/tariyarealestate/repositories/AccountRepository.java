package com.tariyarealestate.tariyarealestate.repositories;

import com.tariyarealestate.tariyarealestate.domains.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {}
