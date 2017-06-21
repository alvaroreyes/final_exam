package com.dh.examen.service;

import com.dh.examen.domain.Buyer;
import com.dh.examen.domain.Car;
import com.dh.examen.domain.Seller;
import com.dh.examen.repository.BuyerRepository;
import com.dh.examen.repository.CarRepository;
import com.dh.examen.repository.SellerRepository;
import com.dh.examen.web.CarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ALVARO on 21/06/2017.
 */
@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private BuyerRepository buyerRepository;
    @Autowired
    private SellerRepository sellerRepository;
    public List<Car> getAllCars(){
        return carRepository.findAll();
    }
    public void addCars(CarController.CarRequestDTO newCarsDTO){
        Car newCar = new Car();
        Buyer buyer=buyerRepository.findOne(newCarsDTO.getBuyerId());
        Seller seller=sellerRepository.findOne(newCarsDTO.getSellerId());
        newCar.setSeller(seller);
        newCar.setBuyer(buyer);

        carRepository.save(newCar);
    }

    public void removeCar(Car newCar){

        carRepository.delete(newCar);
    }
    public void updateCar( long carId,Car car) {

        Car carOld = carRepository.findOne(carId);
        if (carOld != null) {
            carRepository.save(car);
        }
    }

}
