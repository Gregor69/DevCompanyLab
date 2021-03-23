import management.Manager;
import org.junit.Test;
import staff.Employee;
import techstaff.DataBaseAdmin;
import techstaff.Developer;



import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Test
    public void employeeAsDeveloper(){
        employee = new Developer("Paul", "NI70453A", 40000);
        assertEquals("Paul", employee.getName());
    }

    @Test
    public void employeeAsDataBaseAdmin(){
        employee = new DataBaseAdmin("Scott", "NI72453A", 35000);
        assertEquals("Scott", employee.getName());
    }

    @Test
    public void employeeAsManager(){
        employee = new Manager("Graham", "NI70473A", 60000, "Testing");
        assertEquals("Graham", employee.getName());
    }


}
