class Stock{
    String item;
    int qty; //60
    double rate;
    double amt;
    Stock(String a, int qty, double rate){
        this.item=a;
        this.qty=qty; //50
        this.rate=rate;
        this.amt=this.qty*this.rate;
    }
    void display(){
        System.out.println("Name of the item:"+item);
        System.out.println("Quantity: "+qty); //60
        System.out.println("Unit Price: "+rate);
        System.out.println("Net value: "+amt);
    }
}

/**
 * 1. super()- I am referring to the constructor of the super class. It can contain parameters.
 * 2. super.display() - I am calling the display function of the super class, sending variables or parameters is optional.
 * 3. super.quantity- I am calling the quantity variable that is declared in the super class.
 */