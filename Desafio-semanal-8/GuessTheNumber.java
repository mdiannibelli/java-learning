import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = (int)Math.floor(Math.random() * 101);
        int userNum;
        //System.out.println(number);
        do {
            System.out.println("Adivine el número del 1 al 100");
            userNum = scn.nextInt();
            if(number == userNum) {
                System.out.println("Has adivinado! El número era: " + number);
            } else if(userNum > number) {
                System.out.println(userNum + " es mayor al número que estas queriendo adivinar.");
                continue;
            } else {
                System.out.println(userNum + " es menor al número que estas queriendo adivinar.");
                continue;
            }
        } while(userNum > 100 || number != userNum);
        

    }
}