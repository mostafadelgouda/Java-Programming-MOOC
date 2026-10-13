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
public class ExerciseManagementTest {

    public ExerciseManagementTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }
    @Test
    public void addedExerciseIsInList() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
