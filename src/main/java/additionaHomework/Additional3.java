package additionaHomework;

public class Additional3 {

    public boolean has22(int[] nums) {
        boolean two = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return two;
    }

    public boolean lucky13(int[] arr) {
        boolean oneAndThree = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 3) {
                return false;
            }
        }
        return oneAndThree;
    }

    public int maxTriple(int[] oddLength) {
       int max = oddLength[0];
       for(int i = 0; i<oddLength.length; i++){
           if(oddLength[i] > max){
               max = oddLength[i];
           }
       }return max;
    }

    public boolean arrayFront(int[] array) {
        boolean element = false;
        for (int i = 0; i < array.length && i < 4; i++) {
            if (array[i] == 9) {
                return true;
            }
        }
        return element;
    }


    public int[] square(int[] sq) {
        int[] result = new int[sq.length];
        for (int i = 0; i < sq.length; i++) {
            result[i] = sq[i] * sq[i];
        }
        return result;
    }


}
