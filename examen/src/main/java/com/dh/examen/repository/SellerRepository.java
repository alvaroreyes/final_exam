package com.dh.examen.repository;

import com.dh.examen.domain.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ALVARO on 21/06/2017.
 */

public interface SellerRepository extends JpaRepository<Seller,Long>{
    //Seller update(Seller seller);
}
