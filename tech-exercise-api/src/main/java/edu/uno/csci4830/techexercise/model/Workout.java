package edu.uno.csci4830.techexercise.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Workout {
    @Id
    @GeneratedValue
    private Integer id;

    private String date;

    private Integer length;

    private String type;

    public Workout(String type, String date, Integer length) {
        this.type = type;
        this.date = date;
        this.length = length;
    }

}
