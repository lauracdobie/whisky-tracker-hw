package com.example.codeclan.whiskytracker.models;

import javax.persistence.*;

@Entity
@Table(name="whiskies")
public class Whisky {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int year;

    @Column
    private int age;

    public Whisky(String name, int year, int age) {
        this.name = name;
        this.year = year;
        this.age = age;
    }

    public Whisky() {
    }

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
