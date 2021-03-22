import org.junit.Before;
import org.junit.Test;
import techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("James", "NI70223A", 40000);
    }

    @Test
    public void hasName(){
        assertEquals("James", developer.getName());
    }

    @Test
    public void hasNI_No(){
        assertEquals("NI70223A", developer.getNI_No());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2000);
        assertEquals(42000, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400, developer.payBonus(), 0.01);
    }

    @Test
    public void raiseNotNegative(){
        developer.raiseSalary(-1000);
        assertEquals(40000, developer.getSalary());
    }

    @Test
    public void canChangeName(){
        developer.setName("Shug");
        assertEquals("Shug", developer.getName());
    }
}
