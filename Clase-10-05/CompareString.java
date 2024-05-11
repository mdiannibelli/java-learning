import java.util.Scanner;
public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lastEmailPart;
        do {
            String email = sc.nextLine();
            int emailLenght = email.length();
            lastEmailPart = email.substring(emailLenght-10, emailLenght);
        } while (!lastEmailPart.equals("@gmail.com") && !lastEmailPart.equals("@yahoo.com"));
    }
}
