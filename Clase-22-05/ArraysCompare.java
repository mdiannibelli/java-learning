public class ArraysCompare {
    public static void main(String[] args) {
        //Declarations and assign of values
        int[] arr1 = {24,50,14,19};
        int[] arr2 = {24,50,9,19};
        boolean flag = true;
        //Are they the same size?
        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length && flag; i++){
                //Access to the elements in each array
                int temp = arr1[i];
                int user = arr2[i];
                //Compare both values
                if(arr1[i] != arr2[i]){
                    flag = false;
                    System.out.println("Arrays are not equal");
                    //break;
                }
            }
            if(flag){
                System.out.println("Arrays are equal");
            }
        }else{
            System.out.println("Arrays do not match");
        }
    }
}