import java.util.Scanner;

public class usersum {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter Numbers:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is: "+sum);
    }
    
}
