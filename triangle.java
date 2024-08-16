import java.util.Scanner;

public class triangle {
    static double area(double base, double height) {
        return 0.5 + base + height;
    }
    
    public static void main(String[] args) {
        double b, h, answer;
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Base :");
        b = objScanner.nextDouble();
        System.out.println("Height :");
        h = objScanner.nextDouble();
        objScanner.close();
        answer = area(b, h);
        System.out.println("The answer is : " + answer);
    }
}
