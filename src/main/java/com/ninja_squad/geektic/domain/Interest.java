package com.ninja_squad.geektic.domain;

import javax.persistence.*;

/**
 * Created by jordan on 29/06/15.
 */
@Entity
public class Interest {

    @Id
    @SequenceGenerator(name = "interestSeq", sequenceName = "interest_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "interestSeq")
    private long id;

    private String value;

    public Interest() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
