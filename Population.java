import java.util.*;
class Population
{
    float p,r;
    Population(float a,float b)
    {
        p=a;
        r=b;
    }
    void print()
    {
        float q=p;
        for(int i=2001;i<=2007;i++)
        {
            q=q*(1+r/100);
            System.out.println("Population in"+i+"="+q);
        }
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the population in the year 2000:");
        float initial=sc.nextFloat();
        System.out.println("Enter the growth rate:");
        float rate=sc.nextFloat();
        Population ob=new Population(initial,rate);
        ob.print();
    }
}