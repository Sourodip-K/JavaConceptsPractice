class Rectangle {
    double length, breadth;
    Rectangle(double l, double b) {
        this.length=l;
        this.breadth=b;
        area();
        perimeter();
    }
    void area(){
        System.out.println("Area of the rectangle is: " +length*breadth);
        
    }
    void perimeter(){
        System.out.println("Perimeter of the rectangle is: " +2*(length+breadth));
    }
}