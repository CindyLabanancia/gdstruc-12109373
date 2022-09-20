import java.util.Random;

public class NumbersManager {

    private static final int MIN_ARRAY_LENGTH = 100;
    private static final int MAX_ARRAY_LENGTH = 1000;

    public int[] generateNumbers(int desiredArrayLength) {
        
        Random random = new Random();

        if (desiredArrayLength >= MIN_ARRAY_LENGTH && desiredArrayLength <= MAX_ARRAY_LENGTH) {
            
            int[] createdArray = new int[desiredArrayLength];

            //store a random integer to each slot in the array, maximum value of 10000
            for (int i = 0; i < desiredArrayLength; i++) {
                createdArray[i] = random.nextInt(10000);
            }
            
            return createdArray;

        } else {
            System.out.println("Array Length must be within 100-1,000");
            System.exit(0);
            return new int[0];
        }
    }

    public void sortNumbers(int sortType, int[] arrayToManipulate) {
        
        if (sortType == 1) {
            System.out.println("Selected Bubble Sort");
            bubbleSort(arrayToManipulate);

        } else if (sortType == 2) {
            System.out.println("Selected Selection Sort");
            selectionSort(arrayToManipulate);

        } 

        printArray(arrayToManipulate);  //array has been manipulated at this point

    }

    public void printArray(int[] sortedArray) {

        System.out.println("Sorted Array");

        for (int i = 0; i < sortedArray.length; i++) {
            if (i < sortedArray.length - 1) {
                System.out.print(sortedArray[i] + ",");
            } else {
                System.out.print(sortedArray[i]);
            }
        }
    }

    public void bubbleSort(int[] arrayToManipulate) {
        int arrLength = arrayToManipulate.length;
        int temp;

        for (int i = 0; i < arrLength; i++) {
            for (int x = 1; x < (arrLength - i); x++) {
                if (arrayToManipulate[x - 1] > arrayToManipulate[x]) {
                    temp = arrayToManipulate[x - 1];
                    arrayToManipulate[x - 1] = arrayToManipulate[x];
                    arrayToManipulate[x] = temp;
                }
            }
        }
    }

    public void selectionSort(int[] array) {
        int pos;
        int temp;

        for (int i = 0; i < array.length; i++) {

            pos = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[pos]) {            
                    pos = j;
                }
            }

            temp = array[pos];          
            array[pos] = array[i];
            array[i] = temp;
        }
    }

}
