package com.tariyarealestate.tariyarealestate.controllers;

import com.tariyarealestate.tariyarealestate.domains.RealEstate;
import com.tariyarealestate.tariyarealestate.dto.RealEstateDelete;
import com.tariyarealestate.tariyarealestate.dto.RealEstateEditor;
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
    public RealEstate createAccount(@RequestBody RealEstate realEstate) throws Exception {
        return realEstateService.createRealEstate(realEstate);
    }

    @GetMapping("/api/realestate/list")
    public Iterable<RealEstate> showrealEstate(){
        return realEstateService.showrealEstate();
    }

    @PostMapping("/api/realestate/edit")
    public RealEstate editRs(@RequestBody RealEstateEditor rsEditor) throws Exception {
        return realEstateService.editRealEstate(rsEditor);
    }

    @PostMapping("/api/realestate/delete")
    public void deleteRs(@RequestBody RealEstateDelete rsDelete) throws Exception {
        realEstateService.deleteRealEstate(rsDelete);
    }
}
