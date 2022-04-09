package com.smurf.birtday.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Day {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name, data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Day() {
    }

    public Day(String name, String data) {
        this.name = name;
        this.data = data;
    }
}
