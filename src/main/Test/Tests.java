package DAOs;

import DTOs.Employee;
import Exceptions.DaoException;
import junit.framework.TestCase;
import java.time.LocalDate;

public class Tests extends TestCase {
    EmployeeDaoInterface IEmployeeDao = null;
    public void setUp(){
        IEmployeeDao = new MySqlEmployeeDao();
    }

    public void testEmployee() throws DaoException {
        Employee Employee = IEmployeeDao.getEmployeeById(2);

        assertNotNull(Employee);
        assertEquals("Jane", Employee.getFirstName());
        assertEquals("Smith", Employee.getLastName());
        assertEquals("Female", Employee.getGender());
        assertEquals(LocalDate.of(1988, 9, 20), Employee.getDob());
        assertEquals(60000, Employee.getSalary());
        assertEquals("Project Manager", Employee.getRole());
        assertEquals("password2", Employee.getPassword());
    }

    public void testEmployeesByFirstName() throws DaoException{
        Employee Employee = IEmployeeDao.getEmployeeById(2);
        assertEquals("Jane", Employee.getFirstName());
    }

    public void testEmployeesByLastName() throws DaoException{
        Employee Employee = IEmployeeDao.getEmployeeById(2);
        assertEquals("Smith", Employee.getLastName());
    }

    public void testEmployeesByGender() throws DaoException{
        Employee Employee = IEmployeeDao.getEmployeeById(2);
        assertEquals("Female", Employee.getGender());
    }

    public void testEmployeesByDob() throws DaoException{
        Employee Employee = IEmployeeDao.getEmployeeById(2);
        assertEquals(LocalDate.of(1988, 9, 20), Employee.getDob());
    }

    public void testEmployeesByRole() throws DaoException{
        Employee Employee = IEmployeeDao.getEmployeeById(2);
        assertEquals(60000, Employee.getSalary());
    }

    public void testEmployeesByStatus() throws DaoException{
        Employee Employee = IEmployeeDao.getEmployeeById(2);
        assertEquals("Project Manager", Employee.getRole());
    }

    public void testEmployeesByFirstAppearance() throws DaoException{
        Employee Employee = IEmployeeDao.getEmployeeById(2);
        assertEquals("password2", Employee.getPassword());
    }
    

}
