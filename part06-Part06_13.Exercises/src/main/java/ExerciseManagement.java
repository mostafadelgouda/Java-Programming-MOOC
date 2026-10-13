
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ok
 */
public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise: exercises) {
            list.add(exercise.getName());
        }
        return list;
    }

    public void add(String exercisea) {
        this.exercises.add(new Exercise(exercisea));
    }

    public void markAsCompleted(String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                ex.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompleted();
            }
        }
        return false;
    }
    
}
