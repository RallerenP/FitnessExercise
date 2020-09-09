package printers;

import people.Person;

import java.util.List;

public class PersonPrinter extends Printer<List<Person>>
{

    public PersonPrinter(String label)
    {
        super(label);
    }

    @Override
    public void print(List<Person> people)
    {
        startPrint();
        String tableFormat = "%-10s %s\n";
        System.out.printf(tableFormat, "Name", "CPR");
        for (Person person : people)
        {
            System.out.printf(tableFormat, person.getName(), person.getCpr());
        }
        endPrint();
    }
}
