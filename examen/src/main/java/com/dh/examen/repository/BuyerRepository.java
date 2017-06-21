package com.dh.examen.repository;

import com.dh.examen.domain.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ALVARO on 21/06/2017.
 */
public interface BuyerRepository extends JpaRepository<Buyer,Long> {
}
