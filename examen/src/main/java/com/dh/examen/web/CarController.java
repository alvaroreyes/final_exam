package com.dh.examen.web;

import com.dh.examen.domain.Car;
import com.dh.examen.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ALVARO on 21/06/2017.
 */
@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;


    @RequestMapping(method = RequestMethod.GET)
    public List<Car> getAllCar(){
        return carService.getAllCars();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody CarRequestDTO car){
        carService.addCars(car);
    }

    @RequestMapping(method=RequestMethod.DELETE)
    public void removeSeller(@RequestBody Car car) {
       carService.removeCar(car);
    }
    @RequestMapping(method=RequestMethod.PUT)
    public void UpdateSeller(@PathVariable long carId, @RequestBody Car car) {
        carService.updateCar(carId,car);

    }
    public static class CarRequestDTO{

        private long  sellerId;
        private long buyerId;
        private String  brand;
        private String year;
        private String model;
        private String color;

        public long getSellerId() {
            return sellerId;
        }

        public long getBuyerId() {
            return buyerId;
        }

        public String getBrand() {
            return brand;
        }

        public String getYear() {
            return year;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public void setSellerId(long sellerId) {
            this.sellerId = sellerId;
        }

        public void setBuyerId(long buyerId) {
            this.buyerId = buyerId;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    }
