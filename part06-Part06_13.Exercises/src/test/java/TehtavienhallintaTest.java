/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ok
 */
public class TehtavienhallintaTest {
    private ExerciseManagement management;
    public TehtavienhallintaTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        management = new ExerciseManagement();
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        management = new ExerciseManagement();
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management = new ExerciseManagement();
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }
}
