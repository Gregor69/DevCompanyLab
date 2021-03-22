import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Catriona", "NI76129B", 90000, "R&D", 150000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Catriona", director.getName());
    }

    @Test
    public void hasNI_No(){
        assertEquals("NI76129B", director.getNI_No());
    }

    @Test
    public void hasSalary(){
        assertEquals(90000, director.getSalary());
    }

    @Test
    public void hasDept(){
        assertEquals("R&D", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(150000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10000);
        assertEquals(100000, director.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1800, director.payBonus(), 0.01);
    }

    @Test
    public void raiseNotNegative(){
        director.raiseSalary(-1000);
        assertEquals(90000, director.getSalary());
    }

    @Test
    public void canChangeName(){
        director.setName("Sarah");
        assertEquals("Sarah", director.getName());
    }
}
