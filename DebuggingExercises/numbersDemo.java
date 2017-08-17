/**
 * Created by Sam on 17/08/2017.
 */
public class numbersDemo {
    public static void main(String args[]){
        int a = 10, b = 20;
        displayTwiceNumber(a);
        displayTwiceNumber(b);
        displayNumberPlusFive(a);
        displayNumberPlusFive(b);
        displayNumberSquared(a);
        displayNumberSquared(b);

    }
    public static void displayTwiceNumber(int a){
        int b = a + a;
        System.out.println(a + " doubled is " + b);
    }
    public static void displayNumberPlusFive(int a){
        int b = a + 5;
        System.out.println(a + " plus 5 is " + b);
    }
    public static void displayNumberSquared(int a){
        int b = a * a;
        System.out.println(a + " squared is " + b);
    }
}
