import java.util.Scanner;
class employee extends member {
    String specialisation;
    employee(String name, int age, int phoneNumber, String address, double Salary,String specialisation){
        super(name, age, phoneNumber, address, Salary);
        this.specialisation = specialisation;
    }
    void printSalary(){
        System.out.println("Name: "+super.name);
        super.printSalary();
        System.out.println("Specialisation: "+specialisation);
    }
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age= sc.nextInt();
        System.out.println("Enter your phoneNumber: ");
        int phoneNumber= sc.nextInt();
        System.out.println("Enter your address: ");
        String address = sc.nextLine();
        System.out.println("Enter your salary: ");
        Double Salary= sc.nextDouble();
        System.out.println("Enter your specialisation: ");
        String specialise = sc.nextLine();
        employee ob = new employee(name, age, phoneNumber, address, Salary, specialise);
    }
}