public class EstacionamientoVehicular {
    public static void main(String[] args) {
        String plates[] = new String[8];
        String drivers[] = new String[8];
        
        plates[0] = "ACD3456";
        plates[1] = "XDT3776";
        plates[2] = "TTR1966";

        drivers[0] = "Marcos D.";
        drivers[1] = "Pedro A.";
        drivers[2] = "Juan S.";

        // Get last plate
        String lastPlate = "";
        for(int i = 0; i < plates.length; i++) {
            if(plates[i] == null) {
                lastPlate = plates[i-1];
                break;
            }
        }
        System.out.println(lastPlate);

    }
}