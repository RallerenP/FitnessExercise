package printers;

import people.employees.Employee;

import java.util.List;

public class EmployeePrinter extends Printer<List<Employee>>
{

    public EmployeePrinter(String label)
    {
        super(label);
    }

    @Override
    public void print(List<Employee> employees)
    {
        startPrint();
        String tableFormat = "%-10s %s\t%-5s\t%-6s\t%s\n";
        System.out.printf(tableFormat, "Name", "CPR", "Hours", "Salary", "Vacation");
        for (Employee employee : employees)
        {
            System.out.printf(tableFormat,
                    employee.getName(),
                    employee.getCpr(),
                    employee.getHours(),
                    employee.calcSalary(),
                    employee.getVacation()
            );
        }
        endPrint();
    }
}
