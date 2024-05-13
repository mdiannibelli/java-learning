import java.util.Scanner;
public class Yapeyu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pc1 = (int)(Math.random()*2); 
        int pc2 = (int)(Math.random()*2); 
        int pc3 = (int)(Math.random()*2); 
        int user = sc.nextInt();
        int countUp = 0;
        int countDown = 0;

        if(pc1 == 1) countUp++;
        if(pc2 == 1) countUp++;
        if(pc3 == 1) countUp++;
        if(user == 1) countUp++;

        if(pc1 == 0) countDown++;
        if(pc2 == 0) countDown++;
        if(pc3 == 0) countDown++;
        if(user == 0) countDown++;

        if(countUp == 1 || countDown == 1) {
            System.out.println("Hay un ganador");
        } else {
            System.out.println("No hay ganador");
        }
    }
}