package com.ninja_squad.geektic.domain;

import javax.persistence.*;

/**
 * Created by jordan on 29/06/15.
 */
@Entity
public class User {

    @Id
    @SequenceGenerator(name = "userSeq", sequenceName = "user_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSeq")
    private long id;

    private String name;
    private String surname;
    private int age;

    public User() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
