package com.tariyarealestate.tariyarealestate.controllers;

import com.tariyarealestate.tariyarealestate.domains.Account;
import com.tariyarealestate.tariyarealestate.domains.RealEstate;
import com.tariyarealestate.tariyarealestate.services.AccountService;
import com.tariyarealestate.tariyarealestate.services.RealEstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RealEstateController {

    @Autowired
    private RealEstateService realEstateService;

    @PostMapping("/api/realestate/create")
    public RealEstate createAccount(@RequestBody RealEstate realEstate){
        return realEstateService.createRealEstate(realEstate);
    }

    @GetMapping("/api/realestate/list")
    public Iterable<RealEstate> showrealEstate(){
        return realEstateService.showrealEstate();
    }

}
