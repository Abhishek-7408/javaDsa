public class checktype {
    public static void main(String[] args) {
        byte b=4;
        char c='a';
        short s =512;
        int i = 10000;
        float  f=3.15f;
        double d = 99.998;
        double result =(f*b)+(i%c)-(d*s);
        System.out.println(result); 
    }
    
}
