import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter Numbers:");
        Scanner sc = new Scanner(System.in);
        a =sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int avg = a+b+c/3;
        System.out.println(avg); 
    }
    
}
