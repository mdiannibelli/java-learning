import java.util.Scanner;

public class SegundoEjercicio {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of kilometers you want to travel");
        int kilometers = scn.nextInt();
        scn.nextLine();

        int road = kilometers / 2;
        int kilometersTraveled = 0;
        int fuel = 100;

        String stops[] = new String[(int)Math.floor(road / fuel)];
        
        int restFuel = 0;
        int stopsForward = 0;
        
        for(int i = fuel; i <= road; i = i + fuel) {
            System.out.println("Enter the name of the next service station");
            stops[stopsForward] = scn.nextLine();
            kilometersTraveled += 100;
            
            System.out.println("Stop: " + (stopsForward + 1) + ", we arrived to " + stops[stopsForward] + " and we're in " + kilometersTraveled + " km.");
            System.out.println("Loading fuel...");
            stopsForward++;
            if((road - i) < 100) {
                restFuel = road - i;
                break;
            }
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("We arrived to destiny in " + (kilometers / 2) + "! Now we're going to back to home...");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        
        int stopsBackward = 0;
        int pointerName = stops.length - 1;
        int diffFuel = 100 - restFuel;

        kilometersTraveled = road + restFuel;
        for(int i = restFuel; i <= road; i = i + fuel) {
            if(i < fuel) {
                kilometersTraveled = (kilometers / 2) + diffFuel;
                i += fuel;
                System.out.println("Stop: " + (stopsBackward + 1) + ", we arrived to " + stops[pointerName] + " and we're in " + kilometersTraveled + " km.");
                System.out.println("Loading fuel...");
                pointerName--;
            }

            if(pointerName < 0) {
                kilometersTraveled += 100;
                System.out.println("We arrived to home! We traveled " + kilometers + " km.");
                stopsBackward++;
                break;
            }
            
            kilometersTraveled += 100;
            System.out.println("Stop: " + (stopsBackward + 1) + ", we arrived to " + stops[pointerName] + " and we're in " + kilometersTraveled + " km.");
            System.out.println("Loading fuel...");
            stopsBackward++;
            pointerName--;
        }

        if (kilometersTraveled < kilometers) {
            stopsBackward++;
        }

        System.out.println("We made " + stopsForward + " on the way and " + stopsBackward + " on the way back");
        
        System.out.println("All the stops were: ");
        for(int i = 0; i < stops.length; i++) {
            System.out.println(stops[i]);
        }
    }

}
