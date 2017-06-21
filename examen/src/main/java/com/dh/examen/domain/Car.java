package com.dh.examen.domain;

import javax.persistence.*;
import java.awt.*;

/**
 * Created by ALVARO on 20/06/2017.
 */
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Seller seller;
    @ManyToOne
    private Buyer buyer;
    private String  brand;
    private String year;
    private String model;
    private String color;
    private String image;

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

    public String getImage() {
        return image;
    }

    public long getId() {
        return id;
    }


    public Seller getSeller() {
        return seller;
    }

    public Buyer getBuyer() {
        return buyer;
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

    public void setImage(String image) {
        this.image = image;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
}
