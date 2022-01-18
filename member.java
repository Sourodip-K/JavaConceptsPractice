class member {
    String name;
    int age;
    int phoneNumber;
    String address;
    double Salary;
    member(String name, int age, int phoneNumber, String address, double Salary){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.Salary = Salary;
    }
    void printSalary(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phoneNumber);
        System.out.println("Address: "+address);
        System.out.println("Salary: "+Salary);
    }
}