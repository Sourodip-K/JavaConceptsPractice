 import java.util.*;
class Bubble
{
    void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n= sc.nextInt();
        System.out.println("Enter the numbers: ");
        int arr[]= new int[n];
        int c, i,t;
        for(i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        for(i=0; i<(n-1); i++)
        {
            for(int j=0; j<((n-1)-i); j++)
            {
                if(arr[j]>arr[j+1])
                {
                    t= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("Numbers after getting sorted in ascending order: ");
        for(i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}