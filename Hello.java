import java.util.Scanner;
class Hello {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str+" ";
        int length = str.length();
        for(int i = 0; i<length; i++) {
            int SpacePosition=str.indexOf(" ");
            for(int j=0; j<SpacePosition; j++) {
                if(j%2==0) {
                    System.out.print(Character.toUpperCase(str.charAt(j)));
                }
                else
                    System.out.print(Character.toLowerCase(str.charAt(j)));
            }
            System.out.print(" ");
            i=SpacePosition;
            SpacePosition=0;
        }
    }
}