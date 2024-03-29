package Objects;
import DTOs.Employee;

import java.util.Comparator;
public class FirstnameComparator implements Comparator<Employee> {
    /**
     * Main author: Haroldas Tamosauskas
     * Other contributors: ...
     *
     */
    public int compare(Employee emp1, Employee emp2)
    {
        return emp1.getFirstName().compareTo(emp2.getFirstName());
    }
}
