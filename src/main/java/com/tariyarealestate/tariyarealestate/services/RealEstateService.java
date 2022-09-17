package com.tariyarealestate.tariyarealestate.services;

import com.tariyarealestate.tariyarealestate.domains.Account;
import com.tariyarealestate.tariyarealestate.domains.RealEstate;
import com.tariyarealestate.tariyarealestate.repositories.AccountRepository;
import com.tariyarealestate.tariyarealestate.repositories.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealEstateService {

    @Autowired
    private RealEstateRepository realEstateRepository;

    public RealEstate createRealEstate(RealEstate realEstate){
        return realEstateRepository.save(realEstate);
    }

    public Iterable<RealEstate> showrealEstate (){
        return realEstateRepository.findAll();
    }

}
