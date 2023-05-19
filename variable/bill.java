import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        float pen,pencil,eraser;
        Scanner sc = new Scanner(System.in);
        System.out.println("amount of pen");
        pen = sc.nextFloat();
        System.out.println("amount of pencil");
        pencil = sc.nextFloat();
        System.out.println("amount of eraser");
        eraser = sc.nextFloat();
        float total =pencil+pen+eraser;
        float totalBill = total + (0.18f*total);
        System.out.println("Total bill after 18% GSt is: "+totalBill);

    }
    
}
