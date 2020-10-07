package edu.uno.csci4830.techexercise.controller;

import edu.uno.csci4830.techexercise.dto.WorkoutDTO;
import edu.uno.csci4830.techexercise.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/workout")
public class WorkoutController {

    @Autowired
    WorkoutService workoutService;

    @PostMapping("/getWorkout")
    public ResponseEntity<List<WorkoutDTO>> getWorkout(@RequestBody String date) {
        return ResponseEntity.status(HttpStatus.OK).body(this.workoutService.getWorkout(date));
    }

    @PostMapping("/addWorkout")
    public void addWorkout(@RequestBody WorkoutDTO workoutDTO) {
        workoutService.createWorkout(workoutDTO);
    }

}
