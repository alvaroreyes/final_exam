package com.dh.examen.web;

import com.dh.examen.domain.Buyer;
import com.dh.examen.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ALVARO on 21/06/2017.
 */
@RestController
@RequestMapping("/buyers")
public class BuyerController {

    @Autowired
    private BuyerService buyerService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Buyer> getAllCar(){
        return buyerService.getAllBuyers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody BuyerRequestDTO buyers){
        buyerService.addBuyers(buyers);
    }

    @RequestMapping(method=RequestMethod.DELETE)
    public void removeBuyer(@RequestBody Buyer buyer) {
        buyerService.removeBuyer(buyer);
    }
    @RequestMapping(method=RequestMethod.PUT)
    public void UpdateSeller(@PathVariable long buyerId, @RequestBody Buyer buyer) {
        buyerService.updateBuyer(buyerId,buyer);

    }

    public static class BuyerRequestDTO{

        private long sellerId;
        private String name;
        private int ci;
        private String prefession;
        private int cel;

        public long getSellerId() {
            return sellerId;
        }

        public String getName() {
            return name;
        }

        public int getCi() {
            return ci;
        }

        public String getPrefession() {
            return prefession;
        }

        public int getCel() {
            return cel;
        }

        public void setSellerId(long sellerId) {
            this.sellerId = sellerId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCi(int ci) {
            this.ci = ci;
        }

        public void setPrefession(String prefession) {
            this.prefession = prefession;
        }

        public void setCel(int cel) {
            this.cel = cel;
        }
    }
}
