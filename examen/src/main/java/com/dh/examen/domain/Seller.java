package com.dh.examen.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by ALVARO on 20/06/2017.
 */
@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
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

    public long getId() {
        return id;
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

    public void setId(long id) {
        this.id = id;
    }
}
