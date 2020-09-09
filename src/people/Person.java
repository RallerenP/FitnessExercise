package people;

public abstract class Person
{
    private String name;
    private String cpr;

    public Person(String name, String cpr)
    {
        this.name = name;
        this.cpr = cpr;
    }

    public String getCpr()
    {
        return cpr;
    }

    public String getName()
    {
        return name;
    }

    public void setCpr(String cpr)
    {
        this.cpr = cpr;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}