package com.kudiukin.bombs.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bombs")
public class Bomb {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
     private Integer id;
     private String name;
     private int weight;
     private int range;
     private String country;
     private LocalDate produceDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(LocalDate produceDate) {
        this.produceDate = produceDate;
    }
}
