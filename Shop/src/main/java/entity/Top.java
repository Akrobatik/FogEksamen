package entity;

public class Top
{
    private int id;
    private String name;
    private double price;

    public Top()
    {
    }
    
    public Top(int i, String n, double p)
    {
        id = i;
        name = n;
        price = p;
    }
    
    public int getId()
    {
        return id;
    }

    public void setId(int i)
    {
        id = i;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double p)
    {
        price = p;
    }

    @Override
    public String toString()
    {
        return "Bottom{" + "ID=" + id + ", Name=" + name + ", Price=" + price + '}';
    }
}
