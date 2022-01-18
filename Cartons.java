import java.util.*;
class Cartons
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of boxes to be packed");
        int n = sc.nextInt();
        if(n<1||n>1000)
        {
            System.out.println("INVALID ");
            System.exit(0);
        }
        else
        {
        int sizes[]={48,24,12,6};
        int totalboxes=n;
        int total=0;
        for(int i=0;i<sizes.length;i++)
        {
            int totalcarton=n/sizes[i];
            n=n%sizes[i];
            total += totalcarton;
            if(totalcarton!= 0)
            {
               System.out.println(sizes[i]+"*"+ totalcarton+"= "+(sizes[i]*totalcarton)); 
            }
        }
        if(n!=0)
        {
            System.out.println("The number of remaining boxes ="+n+"* 1 ="+ n);
            total ++;
        }
        else
        {
            System.out.println("The number of boxes left="+ 0);
        }
        System.out.println("Total no of boxes ="+n);
        System.out.println("Total no of cartons="+ total);
}
}
}