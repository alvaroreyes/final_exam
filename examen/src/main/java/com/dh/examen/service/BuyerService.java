package com.dh.examen.service;

import com.dh.examen.domain.Buyer;
import com.dh.examen.domain.Seller;
import com.dh.examen.repository.BuyerRepository;
import com.dh.examen.repository.SellerRepository;
import com.dh.examen.web.BuyerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ALVARO on 21/06/2017.
 */
@Service
public class BuyerService {
    @Autowired
    private BuyerRepository buyerRepository;
    @Autowired
    private SellerRepository sellerRepository;

    public List<Buyer> getAllBuyers(){
        return buyerRepository.findAll();
    }

    public void addBuyers(BuyerController.BuyerRequestDTO newBuyerDTO){
        Buyer newBuyer = new Buyer();
        Seller seller=sellerRepository.findOne(newBuyerDTO.getSellerId());
        newBuyer.setSeller(seller);

        buyerRepository.save(newBuyer);
    }
    public void removeBuyer(Buyer newBuyer){

        buyerRepository.delete(newBuyer);
    }
    public void updateBuyer( long buyerId,Buyer buyer) {

        Buyer buyerOld = buyerRepository.findOne(buyerId);
        if (buyerOld != null) {
            buyerRepository.save(buyer);
        }
    }

}
