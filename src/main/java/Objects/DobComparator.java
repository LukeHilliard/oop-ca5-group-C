package Objects;

import DTOs.Employee;

import java.util.Comparator;

public class DobComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getDob().compareTo(emp2.getDob());
    }
}
