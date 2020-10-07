package edu.uno.csci4830.techexercise.repository;

import edu.uno.csci4830.techexercise.model.Workout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface WorkoutRepository extends CrudRepository<Workout, Integer> {

    List<Workout> findAllByDate(String date);

}
