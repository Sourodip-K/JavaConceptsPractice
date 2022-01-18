import java.util.*;
class perfectSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num/2;i++) {
            if(num%i==0 && num/i==i) {
                System.out.println("Perfect Square!");
                break;
            }
        }
    }
}