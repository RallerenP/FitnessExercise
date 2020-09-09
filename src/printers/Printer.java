package printers;

import java.util.List;

public abstract class Printer<P extends List> implements IPrinter<P>
{
    private String label;

    Printer(String label)
    {
        this.label = label;
    }

    void startPrint()
    {
        System.out.println(label);
        System.out.println("***********************************************");
    }

    void endPrint()
    {
        System.out.println("===============================================");
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel(String label)
    {
        this.label = label;
    }
}
