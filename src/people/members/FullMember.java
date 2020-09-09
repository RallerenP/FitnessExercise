package people.members;

public class FullMember extends Member
{
    public FullMember(String name, String cpr)
    {
        super(name, cpr, MemberType.FULL, 299);
    }
}
