import java.util.Scanner;

public class squarearea {
    public static void main(String[] args) {
        float side= 55.55f;
        System.out.println("Enter Side");
        Scanner sc = new Scanner(System.in);
        side = sc.nextFloat();
         float area = side*side;
        System.out.println("Area of square is:"+area);
    }
    
}
