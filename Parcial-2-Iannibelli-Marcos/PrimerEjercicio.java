import java.util.Scanner;
public class PrimerEjercicio {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String names[] = new String[10];
        int notes[] = new int[10];

        int counter = 0;
        System.out.println("Enter student names below:");
        do {
            System.out.println("Student: " + (counter + 1));
            names[counter] = scn.nextLine();
            notes[counter] = (int)Math.floor(Math.random() * 10 + 1);
            counter++;
        } while(counter < 10);

        //! SHOW RESULTS
        System.out.println("------- ALL STUDENTS ---------");
        for(int i = 0; i < names.length; i++) {
            System.out.println("Student name " + names[i] + " and his note is " + notes[i]);
        }

        
        //! APPROVED NOTES 
        System.out.println("------- APPROVED NOTES :-) ---------");
        for(int i = 0; i < names.length; i++) { 
            if(notes[i] >= 4) {
                System.out.println(names[i] + " with note: " + notes[i] + ".");
            }   
        }

        //! PROMOTED NOTES 
        System.out.println("------- PROMOTED NOTES :)) ---------");
        for(int i = 0; i < names.length; i++) { 
            if(notes[i] >= 7) {
                System.out.println(names[i] + " with note: " + notes[i] + ".");
            }   
        }

        //! DISAPPROVED NOTES 
        System.out.println("------- DISAPPROVED NOTES :( ---------");
        for(int i = 0; i < names.length; i++) { 
            if(notes[i] < 4) {
                System.out.println(names[i] + " with note: " + notes[i] + ".");
            }   
        }

        //! HIGHEST NOTE
        System.out.println("------- HIGHEST NOTE ---------");
        int highNotes[] = new int[1];
        int position = 0;
        for(int i = 0; i < names.length; i++) { 
            if(notes[i] > highNotes[0]) {
                highNotes[0] = notes[i];
                position = i;
            }
        }
        System.out.println(names[position] + " with " + highNotes[0] + " congrats!!");

        //! AVERAGE
        System.out.println("------- AVERAGE ---------");
        int totalNotes = 0;
        for(int i = 0; i < notes.length; i++) {
            if(notes[i] > 0) {
                totalNotes += notes[i];
            }
        }
        double average = (double)totalNotes / notes.length;
        System.out.println("Average of: " + average);

        scn.close();
    }
}