package com.dh.examen.repository;

import com.dh.examen.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ALVARO on 21/06/2017.
 */
public interface CarRepository extends JpaRepository<Car,Long> {
}
