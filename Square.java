import java.util.Scanner;
class Square extends Rectangle {
    int side; //global variable
    Square(int s){
        super(s,s);
        this.side = s;    
    }
    void Area(){
         System.out.println("Area of the square is: " +side*side);
         //super.area();
    }
    void Perimeter(){
         System.out.println("Perimeter of the square is: " +4*side);
         //super.perimeter();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side");
        int side = sc.nextInt();
        Square ob = new Square(side); //creating the object, the parameter is passed.
        ob.Area();
        ob.Perimeter();
    }
}