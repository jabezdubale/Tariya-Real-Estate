package com.tariyarealestate.tariyarealestate.services;

import com.tariyarealestate.tariyarealestate.domains.Account;
import com.tariyarealestate.tariyarealestate.domains.RealEstate;
import com.tariyarealestate.tariyarealestate.dto.RealEstateDelete;
import com.tariyarealestate.tariyarealestate.dto.RealEstateEditor;
import com.tariyarealestate.tariyarealestate.repositories.AccountRepository;
import com.tariyarealestate.tariyarealestate.repositories.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealEstateService {

    @Autowired
    private RealEstateRepository realEstateRepository;

    @Autowired
    private AccountRepository accountRepository;

    public RealEstate createRealEstate(RealEstate realEstate) throws Exception {
        Account account = accountRepository.findById(realEstate.getSellerId()).get();
        if (account == null || !account.getPermission().equals("Seller")) {
            throw new Exception();
        }
        else {
            return realEstateRepository.save(realEstate);
        }
    }

    public Iterable<RealEstate> showrealEstate (){
        return realEstateRepository.findAll();
    }

    public RealEstate editRealEstate(RealEstateEditor realEstateEditor) throws Exception {
        RealEstate editedRs = realEstateRepository.findById(realEstateEditor.getEditorRsId()).get();

        if (editedRs == null){
            throw new Exception();
        }

        if (realEstateEditor.getEditorRsSellerId() != null){
            editedRs.setSellerId(realEstateEditor.getEditorRsSellerId());
        }

        if (realEstateEditor.getEditorLatitude() != null){
            editedRs.setLocationLatitude(realEstateEditor.getEditorLatitude());
        }

        if (realEstateEditor.getEditorLongitude() != null){
            editedRs.setLocationLongitude(realEstateEditor.getEditorLongitude());
        }
        if (realEstateEditor.getEditorRsHouseType() != null){
            editedRs.setHouseType(realEstateEditor.getEditorRsHouseType());
        }
        if (realEstateEditor.getEditorRsPrice() != null){
            editedRs.setPrice(realEstateEditor.getEditorRsPrice());
        }
        if (realEstateEditor.getEditorRsDescription() != null){
            editedRs.setDescription(realEstateEditor.getEditorRsDescription());
        }
        if (realEstateEditor.getEditorRsVerificationDocs() != null){
            editedRs.setVerificationDocs(realEstateEditor.getEditorRsVerificationDocs());
        }
        if (realEstateEditor.getEditorRsVerificationStatus() != null){
            editedRs.setVerificationStatus(realEstateEditor.getEditorRsVerificationStatus());
        }
        if (realEstateEditor.getEditorRsHouseStatus() != null){
            editedRs.setHouseStatus(realEstateEditor.getEditorRsHouseStatus());
        }

        return realEstateRepository.save(editedRs);
    }

    public void deleteRealEstate(RealEstateDelete realEstateDelete) throws Exception {
        RealEstate deleteRs = realEstateRepository.findById(realEstateDelete.getDeleteId()).get();
        if (deleteRs == null){
            throw new Exception();
        }
        else {
            realEstateRepository.deleteById(realEstateDelete.getDeleteId());
        }
    }



}
