//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String firstName = "Pablo";
        String lastName = "Silva";
        String DNI = "45688669";
        String adress = "Cuenca 1042";
        int yearsInCompany = 8;
        boolean driverLicense = true;
        boolean wearsGlasses = false;
        char areaCompany = 'B';

        System.out.println(firstName + " " + lastName);
        System.out.println(DNI);
        System.out.println(adress);
        System.out.println(yearsInCompany);
        System.out.println("Licencia de conducir: " + driverLicense);
        System.out.println("Lleva anteojos: " + wearsGlasses);
        System.out.println("Área: " + areaCompany);

        var texto = "Todos los días el sol nace desde aquella montaña";
        String textToMayus = texto.toUpperCase();
        System.out.println(textToMayus);
        int textLength = texto.length();
        System.out.println(textLength);
        char firstChar = texto.charAt(1);
        char lastChar = texto.charAt(texto.length() - 1);
        char middleChar = texto.charAt(textLength/2);
        System.out.println(firstChar);
        System.out.println(lastChar);
        System.out.println(middleChar);
        var parseChars = (int) firstChar + (int) lastChar + (int) middleChar;
        System.out.println(parseChars);
    }
}