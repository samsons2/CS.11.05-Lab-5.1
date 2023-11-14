public class ArrayUtility {

    public static void print(int[] array) {
            System.out.print(array);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        double sum = 0;
        for(int i = 0; i<array.length; i++){
            sum = sum + array[i];
        }double average = sum/array.length;
        int dp = (int)(average*100);
        double output = (double)dp/100;
        return output;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for(int i = 0; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for(int i = 0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }


    public static int evenCount(int[] array) {
        int count = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]%2==0){
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversed = new int[array.length];
        for(int i = array.length-1; i>=0; i--){
            reversed[array.length-i-1]=array[i];
        }
        return reversed;
    }

    public static void reverseTwo(int[] array) {
        for(int i = 0; i<array.length/2; i++){
            int a = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i]=a;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i = 0; i<array.length; i++){
            if(array[i]==num){
                return true;
            }
        }return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for(int i = 0; i<array.length; i++){
            if(array[i].equals(str)){
                return true;
            }
        }return false;
    }

    public static void multiplyByTwo(int[] array) {
        for(int i = 0; i<array.length; i++){
            array[i]=array[i]*2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for(int i = 0; i<array.length; i++){
            array[i]=array[i]*n;
        }
    }

    public static String toString(int[] array) {
        String output = "";
        for(int i = 0; i<array.length; i++){
            if(i==array.length-1){
                output = output + array[i];
            }else{
                output = output + array[i] +", ";
            }
        }return output;
    }

    public static boolean twoSum(int[] array, int num) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(i==j){
                    continue;
                }else if(array[i]+array[j]==num){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int last = array[array.length-1];
        for(int i = array.length-1; i>=1; i--){
            array[i]=array[i-1];
        }array[0]=last;
    }

    public static void shiftLeft(int[] array) {
        int first = array[0];
        for(int i = 0; i<array.length-1; i++){
            array[i]=array[i+1];
        }array[array.length-1]=first;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int a = 0; a < n; a++) {
            int last = array[array.length - 1];
            for (int i = array.length - 1; i >= 1; i--) {
                array[i] = array[i - 1];
            }
            array[0] = last;
        }
    }
    public static void shiftLeftNTimes(int[] array, int n) {
        for(int a = 0; a<n; a++){
            int first = array[0];
            for(int i = 0; i<array.length-1; i++){
                array[i]=array[i+1];
            }array[array.length-1]=first;
        }

    }


}
