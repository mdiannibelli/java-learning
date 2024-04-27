//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome Marcos!");
        int edad = 57;
        char sexo = 'M';
        boolean valid = true;
        double ganancias = 18.52;
        String saludo = "Hola";
        saludo = " Adios";
        saludo = saludo + " espero que te encuentres bien";
        System.out.println("Mi edad es: " + edad + saludo);

        // String methods
        String texto = "Esto es un texto";
        // charAt
        char chracters = texto.charAt(5);
        System.out.println(chracters); //e

        // length
        int lengthTexto = texto.length();
        System.out.println(lengthTexto); //16

        // toUpperCase
        String textToMayus = texto.toUpperCase();

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            //System.out.println("i = " + i);
        }
    }
}