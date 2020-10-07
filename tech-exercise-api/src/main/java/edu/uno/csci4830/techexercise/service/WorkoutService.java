package edu.uno.csci4830.techexercise.service;

import edu.uno.csci4830.techexercise.dto.WorkoutDTO;
import edu.uno.csci4830.techexercise.model.Workout;
import edu.uno.csci4830.techexercise.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class WorkoutService {

    @Autowired
    WorkoutRepository workoutRepository;

    public void createWorkout(WorkoutDTO workoutDTO) {
        Workout workout = new Workout(workoutDTO.getType(), workoutDTO.getDate(), workoutDTO.getLength());
        workoutRepository.save(workout);
    }

    public List<WorkoutDTO> getWorkout(String date) {
        List<Workout> workouts = workoutRepository.findAllByDate(date);
        List<WorkoutDTO> workoutDTOList = new ArrayList();
        workouts.forEach(x->workoutDTOList.add(new WorkoutDTO(x.getType(), x.getDate(), x.getLength())));
        return workoutDTOList;
    }




}
