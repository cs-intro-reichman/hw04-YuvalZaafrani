public class ArrayOps {
    public static void main(String[] args) {
    
    }
    
    public static int findMissingInt (int [] array) {
        int size = array.length;
        int sumTotal = 0;
        int sumArray = 0;

        for(int i = 1 ; i <= size; i++){
            sumTotal = sumTotal + i;
        }

        for(int i = 0; i < size ; i++){
            sumArray = sumArray + array[i];
        }

        return sumTotal - sumArray;
    }

    public static int secondMaxValue(int [] array) {
        int max;
        int secondMax;

        if(array[0] > array[1]){
            max = array[0];
            secondMax = array[1];
        }
        else{
            max = array[1];
            secondMax = array[0];
        }

        for(int i = 2 ; i < array.length; i++){
            if(array[i] > max){
                secondMax = max;
                max = array[i];
            }
            else if(array[i] > secondMax){
                secondMax = array[i];
            }
        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        return containsOneWay(array1,array2) && containsOneWay(array2,array1);
    }
    public static boolean containsOneWay(int [] array1,int [] array2) {
        boolean sameElements = false;

        for(int i = 0; i < array1.length; i++){
            sameElements = false;
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    sameElements = true;
                    break;
                }
            }
            if (sameElements == false){
                return  false;
            }
        }

        return true;
    }

    public static boolean isSorted(int [] array) {
        return isSortedUp(array) || isSortedDown(array);
    }
    public static boolean isSortedUp(int [] array) {

        for (int i = 0; i < (array.length - 1); i++){
            if ( array[i+1] < array[i] ) {
                return false;
            }

        }
        return true;
    }

    public static boolean isSortedDown(int [] array) {

        for (int i = 0; i < (array.length - 1); i++){
            if ( array[i+1] > array[i] ) {
                return false;
            }

        }
        return true;
    }

}
