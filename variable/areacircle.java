import java.util.Scanner;

public class areacircle {
    public static void main(String[] args) {
        float r;
        System.out.println("Enter radius");
        Scanner sc = new Scanner(System.in);
        r =sc.nextFloat();
        float area= 22/7*r*r;
        System.out.println(area);
    }
    
}
