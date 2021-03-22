import org.junit.Before;
import org.junit.Test;
import techstaff.DataBaseAdmin;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    private DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("Paul", "NI73261A", 35000);
    }

    @Test
    public void hasName(){
        assertEquals("Paul", dataBaseAdmin.getName());
    }

    @Test
    public void hasNI_No(){
        assertEquals("NI73261A", dataBaseAdmin.getNI_No());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000, dataBaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        dataBaseAdmin.raiseSalary(1000);
        assertEquals(36000, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(350, dataBaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void raiseNotNegative(){
        dataBaseAdmin.raiseSalary(-1000);
        assertEquals(35000, dataBaseAdmin.getSalary());
    }

    @Test
    public void canChangeName(){
        dataBaseAdmin.setName("Bill");
        assertEquals("Bill", dataBaseAdmin.getName());
    }
}
