import org.junit.Before;
import org.junit.Test;
import management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Phil", "NI45678B", 60000, "Testing");
    }

    @Test
    public void hasName(){
        assertEquals("Phil", manager.getName());
    }

    @Test
    public void hasNI_No(){
        assertEquals("NI45678B", manager.getNI_No());
    }

    @Test
    public void hasDept(){
        assertEquals("Testing", manager.getDeptName());
    }

    @Test
    public void hasSalary(){
        assertEquals(60000, manager.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5000);
        assertEquals(65000, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(600, manager.payBonus(), 0.01);
    }

    @Test
    public void raiseNotNegative(){
        manager.raiseSalary(-1000.00);
        assertEquals(60000, manager.getSalary(), 0.01);
    }

    @Test
    public void canChangeName(){
        manager.setName("John");
        assertEquals("John", manager.getName());
    }


}
