package com.dh.examen.service;

import com.dh.examen.domain.Seller;
import com.dh.examen.repository.SellerRepository;
import com.dh.examen.web.SellerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ALVARO on 21/06/2017.
 */
@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public List<Seller> getAllSeller(){
        return sellerRepository.findAll();
    }

    public void addSeller(SellerController.SellerRequestDTO newSellerDTO){
        Seller newSeller = new Seller();
        newSeller.setName(newSellerDTO.getName());
        newSeller.setAge(newSellerDTO.getAge());
        newSeller.setCi(newSellerDTO.getCi());
        newSeller.setNum_cars_sold(newSellerDTO.getNum_cars_sold());

        sellerRepository.save(newSeller);
    }

    public void removeSeller(Seller newSeller){

        sellerRepository.delete(newSeller);
    }
    public void ubdateSeller( long sellerId,Seller seller) {

        // return sellerRepository.findOne(newSeller.getId());

        Seller sellerOld = sellerRepository.findOne(sellerId);
        if (sellerOld != null) {
            sellerRepository.save(seller);
        }
    }



}
