package com.dh.examen.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ALVARO on 20/06/2017.
 */
@Entity
public class RegistryCarSold {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date Dateofsell;
    @ManyToOne
    private Seller seller;

    public long getId() {
        return id;
    }

    public Date getDateofsell() {
        return Dateofsell;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDateofsell(Date dateofsell) {
        Dateofsell = dateofsell;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
