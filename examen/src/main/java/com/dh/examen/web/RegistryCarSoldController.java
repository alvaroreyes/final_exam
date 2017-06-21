package com.dh.examen.web;

import com.dh.examen.domain.RegistryCarSold;
import com.dh.examen.service.RegistryCarSoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by ALVARO on 21/06/2017.
 */
@RestController
@RequestMapping("/registries")
public class RegistryCarSoldController {

    @Autowired
    private RegistryCarSoldService registryCarSoldService;

    @RequestMapping(method = RequestMethod.GET)
    public List<RegistryCarSold> getAllRegistry(){
        return registryCarSoldService.getAllRegistry();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody RegistryCarSoldRequestDTO registrys){
       registryCarSoldService.addRegistry(registrys);
    }
    @RequestMapping(method=RequestMethod.DELETE)
    public void removeSeller(@RequestBody RegistryCarSold registryCarSold) {
        registryCarSoldService.removeRegistry(registryCarSold);
    }
    @RequestMapping(method=RequestMethod.PUT)
    public void UpdateSeller(@PathVariable long registryId, @RequestBody RegistryCarSold registryCarSold) {
        registryCarSoldService.ubdateRegistry(registryId,registryCarSold);

    }



    public static class RegistryCarSoldRequestDTO{
        private Date Dateofsell;
        private long sellerId;

        public Date getDateofsell() {
            return Dateofsell;
        }

        public long getSellerId() {
            return sellerId;
        }

        public void setDateofsell(Date dateofsell) {
            Dateofsell = dateofsell;
        }

        public void setSellerId(long sellerId) {
            this.sellerId = sellerId;
        }
    }

    }
