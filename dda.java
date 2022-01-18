import java.util.*;
class dda {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the no of columns: ");
        int columns=sc.nextInt();
        int arr[][]=new int [rows][columns];
        System.out.println("Enter the elements: ");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original DDA is: ");
         for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
        //transposition starts here.
        int row,col;
        int arrT[][]=new int[rows][columns];
        for(row=0;row<rows;row++) {
              for(col=0;col<columns;col++) {
            arrT[row][col] = arr[col][row];
             }
        }
        System.out.println("Transposed DDA is: ");
         for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                System.out.print(arrT[i][j]+"\t");
            }
            System.out.println("\n");//new line escape sequence
        }
    }
}