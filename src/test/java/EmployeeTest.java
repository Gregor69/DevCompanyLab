import org.junit.Test;
import staff.Employee;
import techstaff.DataBaseAdmin;
import techstaff.Developer;

import javax.xml.crypto.Data;

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


}