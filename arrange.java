import java.util.*;
class arrange {
    int ch;
    arrange(){
        ch=0;
    }
    
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        ch=sc.nextInt();
    }
    
    
    void main() {
        arrange ob = new arrange();
        ob.input();
    }
}