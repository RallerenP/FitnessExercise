package people.members;

import people.Person;

public abstract class Member extends Person
{
    private MemberType type;
    private int fee;

    public Member(String name, String cpr, MemberType type, int fee)
    {
        super(name, cpr);

        this.type = type;
        this.fee = fee;
    }

    public MemberType getType()
    {
        return type;
    }

    public int getFee()
    {
        return fee;
    }
}
