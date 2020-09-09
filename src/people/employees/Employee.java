package people.employees;

import people.Person;

public abstract class Employee extends Person
{
    private int hourlyWage;
    private int hours;
    private int vacation;

    public Employee(String name, String cpr, int hourlyWage, int hours, int vacation)
    {
        super(name, cpr);
        this.hourlyWage = hourlyWage;
        this.hours = hours;
        this.vacation = vacation;
    }

    public int getHourlyWage()
    {
        return hourlyWage;
    }

    public void setHourlyWage(int hourlyWage)
    {
        this.hourlyWage = hourlyWage;
    }

    public int getHours()
    {
        return hours;
    }

    public void setHours(int hours)
    {
        this.hours = hours;
    }

    public int getVacation()
    {
        return vacation;
    }

    public void setVacation(int vacation)
    {
        this.vacation = vacation;
    }

    public int calcSalary()
    {
        return hourlyWage * hours;
    }
}
