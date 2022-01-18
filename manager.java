import java.util.Scanner;
class manager extends member {
    String department;
    manager(String name, int age, int phoneNumber, String address, double Salary,String department){
        super(name, age, phoneNumber, address, Salary);
        this.department = department;
    }
    void printSalary(){
        super.printSalary();
        System.out.println("Department: "+department);
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
        System.out.println("Enter your department: ");
        String dept = sc.nextLine();
        manager ob = new manager(name, age, phoneNumber, address, Salary, dept);
    }
}