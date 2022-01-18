import java.util.*;
class Purchase extends Stock {
    int pqty;
    double prate;
    Purchase(String item, int qty, double rate,int p_quantity, double p_rate){
        super(item, qty, rate);  //50  
        pqty = p_quantity; //10
        prate = p_rate;
    }
    void update(){
        super.qty=super.qty+pqty; //60
        if(prate!=super.rate){
            super.rate=prate;
        }
        super.amt=super.qty*super.rate;
    }
    void display(){
        super.display();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the stock: ");
        String name = sc.nextLine();
        System.out.println("Enter the current qty of the stock: ");
        int qty = sc.nextInt(); //50
        System.out.println("Enter the current rate of the stock: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the newly purchased quantity:");
        int pqty=sc.nextInt(); //10
        System.out.println("Enter the purchased rate of the stock: ");
        double p_rate = sc.nextDouble();
        Purchase ob = new Purchase(name, qty, rate, pqty,p_rate); //50
        System.out.println("Stock Details before Updation:");
        ob.display();
        ob.update();
        System.out.println("Stock Details after Updation:");
        ob.display();
        }
}
