package com.arghyam.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "water_details")
public class Water {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long village_id;

    @Column (nullable = false)
    private String village_name;

    @Column
    private String hardness;

    @Column
    private int total_houses;

    @Column
    private int total_houses_with_tap;


    public String getVillage_name() {
        return village_name;
    }

    public void setVillage_name(String village_name) {
        this.village_name = village_name;
    }

    public String getHardness() {
        return hardness;
    }

    public void setHardness(String hardness) {
        this.hardness = hardness;
    }

    public int getTotal_houses() {
        return total_houses;
    }

    public void setTotal_houses(int total_houses) {
        this.total_houses = total_houses;
    }

    public int getTotal_houses_with_tap() {
        return total_houses_with_tap;
    }

    public void setTotal_houses_with_tap(int total_houses_with_tap) {
        this.total_houses_with_tap = total_houses_with_tap;
    }
}
