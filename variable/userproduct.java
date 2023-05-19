import java.util.Scanner;

public class userproduct {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter Numbers:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int product=a*b;
        System.out.println("Product is:"+product);
    }
    
}
