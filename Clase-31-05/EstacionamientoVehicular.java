import java.util.Scanner;
public class EstacionamientoVehicular {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String plates[] = new String[8];
        String drivers[] = new String[8];
        
        plates[0] = "ACD3456";
        plates[1] = "XDT3776";
        plates[2] = "TTR1966";

        drivers[0] = "Marcos D.";
        drivers[1] = "Pedro A.";
        drivers[2] = "Juan S.";

        
        // Vehicles quantity
        int vehiclesQuantity = 0;
        // Get last plate
        String lastPlate = "";
        for(int i = 0; i < plates.length; i++) {
            if(plates[i] == null) {
                lastPlate = plates[i-1];
                break;
            }
            vehiclesQuantity++;
        }
        System.out.println(lastPlate);
        System.out.println(vehiclesQuantity);

        // Find a driver
        String driverToFind;
        boolean foundedDriver = false;
        int driverPosition = 0;
        System.out.println("Introduce the name of the driver you want to search");
        driverToFind = scn.nextLine();
        for(int k = 0; k < drivers.length; k++) {
            String c = drivers[k];
            if(c == null) continue;
            if(c.toLowerCase().equals(driverToFind.toLowerCase())) {
                foundedDriver = true;
                driverPosition = k;
                break;
            }
        }

        if(foundedDriver) {
            System.out.println("Driver founded! ");
            System.out.println(drivers[driverPosition]);
            System.out.println(plates[driverPosition]);
        } else {
            System.out.println("We can't found a driver");
        }

    }
}