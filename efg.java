class efg{
    void main(String args[]){
        abc obj = new abc(7);
        obj.display();
        abc ob = new abc(5);
    }
}
class abc{ 
    int xyz;
    abc() {
        System.out.println("Whatsup?");
    } //default constructor
    abc(int num) {
        this();
        this.xyz=num;
    }//parameterized constructor
    void display() {
        System.out.println("The value is: "+this.xyz);
    }
}
