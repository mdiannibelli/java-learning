import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String names[] = new String[5];
        int ages[] = new int[5];

        System.out.println("Enter name and age of 5 people");
        int counter = 0;
        do {
            System.out.println("Name:");
            String name = scn.nextLine();
            names[counter] = name;
            System.out.println("Age:");
            int age = scn.nextInt();
            ages[counter] = age;
            counter++;
            scn.nextLine();
        }while(counter < 5);

        for(int i = 0; i < names.length; i++) {
            if(ages[i] >= 18) {
                System.out.println(names[i] + " " + ages[i]);
            }
        }

        scn.close();
    }
}
