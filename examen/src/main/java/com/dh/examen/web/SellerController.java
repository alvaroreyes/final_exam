package com.dh.examen.web;

import com.dh.examen.domain.Seller;
import com.dh.examen.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ALVARO on 21/06/2017.
 */
@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Seller> getAllUser(){
        return sellerService.getAllSeller();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody SellerRequestDTO seller){
        sellerService.addSeller(seller);
    }
    @RequestMapping(method=RequestMethod.DELETE)
    public void removeSeller(@RequestBody Seller seller) {
        sellerService.removeSeller(seller);
    }
    @RequestMapping(method=RequestMethod.PUT)
    public void UpdateSeller(@PathVariable long sellerId, @RequestBody Seller seller) {
       sellerService.ubdateSeller(sellerId,seller);

    }






    public static class SellerRequestDTO{

        private String name;
        private int age;
        private int ci;
        private int num_cars_sold;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getCi() {
            return ci;
        }

        public int getNum_cars_sold() {
            return num_cars_sold;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setCi(int ci) {
            this.ci = ci;
        }

        public void setNum_cars_sold(int num_cars_sold) {
            this.num_cars_sold = num_cars_sold;
        }
    }

}
