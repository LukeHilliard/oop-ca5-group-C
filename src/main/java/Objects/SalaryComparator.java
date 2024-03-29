package Objects;

import DTOs.Employee;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    /**
     * Main author: Haroldas Tamosauskas
     * Other contributors: ...
     *
     */
    public int compare(Employee emp1, Employee emp2)
    {
        int ans = (int)((emp1.getSalary() - emp2.getSalary())*100);
        return ans;
    }
    }
