package entity;

import java.io.Serializable;

public class Customer implements Serializable
{
    private int id;
    private String name;
    private String password;
    private double balance;

    public Customer(String n, String p, double b)
    {
        name = n;
        password = p;
        balance = b;
        
    }

    public Customer(int i, String n, String p, double b)
    {
        id = i;
        name = n;
        password = p;
        balance = b;
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

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String p)
    {
        password = password;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double b)
    {
        balance = b;
    }

    @Override
    public String toString()
    {
        return "Customer{" + "ID=" + id + ", Name=" + name + ", Password=" + password + ", Balance=" + balance + '}';
    }
}
