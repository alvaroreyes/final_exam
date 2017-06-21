package com.dh.examen.domain;

import javax.persistence.*;
import java.awt.*;

/**
 * Created by ALVARO on 20/06/2017.
 */
@Entity
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Seller seller;
    private String name;
    private int ci;
    private String prefession;
    private int cel;

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

    public long getId() {
        return id;
    }

    public Seller getSeller() {
        return seller;
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

    public void setId(long id) {
        this.id = id;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
