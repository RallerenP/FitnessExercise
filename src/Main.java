import people.employees.AdministrativeEmployee;
import people.employees.Employee;
import people.employees.Instructor;
import people.Person;
import people.members.BasicMember;
import people.members.FullMember;
import people.members.Member;
import printers.EmployeePrinter;
import printers.MemberPrinter;
import printers.PersonPrinter;
import printers.Printer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee ib = new Instructor("Ib", "1", 9);
        Employee bob = new AdministrativeEmployee("Bob", "2");
        Employee dennis = new AdministrativeEmployee("Dennis", "3");

        Member karen = new FullMember("Karen", "4");
        Member søren = new BasicMember("Søren", "5");

        Printer<List<Person>> pp = new PersonPrinter("EMPLOYEES & MEMBERS Name and cpr");
        Printer<List<Employee>> ep = new EmployeePrinter("FITNESS EMPLOYEES");
        Printer<List<Member>> mp = new MemberPrinter("FITNESS MEMBERS");

        List<Employee> employees = new ArrayList<>();

        employees.add(ib);
        employees.add(bob);
        employees.add(dennis);
        ep.print(employees);

        System.out.println();

        List<Member> members = new ArrayList<>();
        members.add(karen);
        members.add(søren);
        mp.print(members);

        System.out.println();

        List<Person> people = new ArrayList<>();
        people.addAll(employees);
        people.addAll(members);
        pp.print(people);
    }
}
