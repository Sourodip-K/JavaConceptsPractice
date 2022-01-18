class Child extends Parent {
    void display() {
        super.display();
        System.out.println("This is a child class!");
    }
    void main(){
        Child ob1 = new Child();
        ob1.display();
    }
}