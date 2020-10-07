package edu.uno.csci4830.techexercise.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class WorkoutDTO {

    private String type;
    private String date;
    private Integer length;

}
