package people.members;

public class BasicMember extends Member
{

    public BasicMember(String name, String cpr)
    {
        super(name, cpr, MemberType.BASIC, 199);
    }
}
