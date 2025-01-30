import java.util.Scanner;
public class Subtraction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int difference=a-b;
        System.out.println("the difference of a and b" +  difference);
        scanner.close();
    }
    
}
