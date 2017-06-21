package com.dh.examen.service;

import com.dh.examen.domain.RegistryCarSold;
import com.dh.examen.domain.Seller;
import com.dh.examen.repository.RegistryCarSoldRepository;
import com.dh.examen.repository.SellerRepository;
import com.dh.examen.web.RegistryCarSoldController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ALVARO on 21/06/2017.
 */
@Service
public class RegistryCarSoldService {
    @Autowired
    private RegistryCarSoldRepository registryCarSoldRepository;
    @Autowired
    private SellerRepository sellerRepository;
    public List<RegistryCarSold> getAllRegistry(){
        return registryCarSoldRepository.findAll();
    }
    public void addRegistry(RegistryCarSoldController.RegistryCarSoldRequestDTO newRegistrysDTO){

        RegistryCarSold newRegistry=new RegistryCarSold();
        newRegistry.setDateofsell(newRegistrysDTO.getDateofsell());

        Seller seller = sellerRepository.findOne(newRegistrysDTO.getSellerId());
        newRegistry.setSeller(seller);

        registryCarSoldRepository.save(newRegistry);
    }

    public void removeRegistry(RegistryCarSold newRegistry){

        registryCarSoldRepository.delete(newRegistry);
    }
    public void ubdateRegistry( long registryId,RegistryCarSold registryCarSold) {

        RegistryCarSold registryOld = registryCarSoldRepository .findOne(registryId);
        if (registryOld != null) {
            registryCarSoldRepository.save(registryCarSold);
        }
    }
}
