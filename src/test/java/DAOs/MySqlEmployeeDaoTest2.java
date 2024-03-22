package DAOs;

import DTOs.Employee;
import Exceptions.DaoException;
import junit.framework.TestCase;


import java.time.LocalDate;

public class MySqlEmployeeDaoTest2 extends TestCase {
    EmployeeDaoInterface IEmployeeDao = null;


    public void setUp(){
        IEmployeeDao = new MySqlEmployeeDao();
    }

    public void testEmployeesByFirstnameLastname() throws DaoException {
        Employee emp = IEmployeeDao.getEmployeeByFirstnameLastname("Michael", "Johnson");
        assertNotNull(emp);
        assertEquals("michael_johnson",emp.getUsername());
        assertEquals("password3", emp.getPassword());
        assertEquals("Michael", emp.getFirstName());
        assertEquals("Johnson", emp.getLastName());
        assertEquals("Male", emp.getGender());
        assertEquals(LocalDate.of(1995, 3, 10), emp.getDob());
        assertEquals(70000.0, emp.getSalary());
        assertEquals("Data Analyst", emp.getRole());
        assertEquals(3,emp.getId());
    }
}