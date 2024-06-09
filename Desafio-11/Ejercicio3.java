public class Ejercicio3 {
    public static void main(String[] args) {
        int nums[] = new int[10];

        int counter = 0;
        do {
            int randomNum = (int)Math.floor(Math.random() * 25 + 1); // 1 to 25
            boolean isRepeated = false;
            for(int i = 0; i < counter; i++) {
                if(nums[i] == randomNum) {
                    isRepeated = true;
                    break;
                }
            }

            if(!isRepeated) {
                nums[counter] = randomNum;
                counter++;    
            }
            
        }while(counter < 10);

        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
