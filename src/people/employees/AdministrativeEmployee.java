package people.employees;

public class AdministrativeEmployee extends Employee
{

    public AdministrativeEmployee(String name, String cpr)
    {
        super(name, cpr, 0, 37, 5);
    }

    @Override
    public int calcSalary()
    {
        return 33000;
    }
}
