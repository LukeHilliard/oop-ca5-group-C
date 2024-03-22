package DAOs;

import DTOs.Employee;
import Exceptions.DaoException;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

public class MySqlEmployeeDaoTest extends TestCase {
    EmployeeDaoInterface IEmployeeDao = null;


    public void setUp(){
        IEmployeeDao = new MySqlEmployeeDao();
    }

    public void testEmployeesById() throws DaoException {
        Employee emp = IEmployeeDao.getEmployeeById(2);
        assertNotNull(emp);
        assertEquals("jane_smith",emp.getUsername());
        assertEquals("password2", emp.getPassword());
        assertEquals("Jane", emp.getFirstName());
        assertEquals("Smith", emp.getLastName());
        assertEquals("Female", emp.getGender());
        assertEquals(LocalDate.of(1988, 9, 20), emp.getDob());
        assertEquals(60000.0, emp.getSalary());
        assertEquals("Project Manager", emp.getRole());
        assertEquals(2,emp.getId());
    }
}