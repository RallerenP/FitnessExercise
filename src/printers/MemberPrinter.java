package printers;

import people.Person;
import people.members.Member;

import java.util.List;

public class MemberPrinter extends Printer<List<Member>>
{

    public MemberPrinter(String label)
    {
        super(label);
    }

    @Override
    public void print(List<Member> members)
    {
        startPrint();
        String tableFormat = "%-10s %-5s %-10s\t%s\n";

        System.out.printf(tableFormat, "Name", "CPR", "Member type", "Fee");
        for (Member member : members)
        {
            System.out.printf(tableFormat,
                    member.getName(),
                    member.getCpr(),
                    member.getType(),
                    member.getFee()
                    );
        }
        endPrint();
    }
}
