import java.util.*;
 class Laptops
{
    String name;double price,amt,dis;
    Laptops(String name,double price )
    {
        amt=0;
        dis=0;
        name=name;
        price=price;
    }
    
    void Compute()
    {
        if(price<=25000)
        {
            dis=price*0.05;
        }
        else
        if(price<=50000)
        {
            dis=price*0.075;
        }
        else
        if(price<=100000)
        {
            dis=price*0.10;
        }
        else
        {
            dis=price*0.15;
        }
        amt=price-dis;
    }
    void display()
    {
        System.out.println("The name of the customer="+name);
        System.out.println("The discount given ="+dis);
        System.out.println("The amount to be paid="+amt);
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the customer's name:");
        String str=sc.nextLine();
        System.out.println("Enter the price:");
        double p=sc.nextDouble();
        Laptops ob=new Laptops(str,p);
        ob.Compute();
        ob.display();
    }
}