public class randomLettNums {
    public static void main(String[] args) {
        String letras = "";
        String nums = "";

        while(letras.length() < 10 & nums.length() < 10) {
            int x = (int)Math.floor(Math.random() * 255) + 1; // 1 to 255
            char c = (char)x;

            // Verificar si es letra
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                letras += c;
            } else if (c >= '0' && c <= '9') {
                nums += c;
            }
        }

        System.out.println(letras);
        System.out.println(nums);
    }
}