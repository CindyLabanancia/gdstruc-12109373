import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			NumbersManager numbersManager = new NumbersManager();

			//create an array (with desired length) of unsorted integers
			System.out.println("Type Desired Array Length (100-1000)");
			int desiredLength = scanner.nextInt();
			int[] generatedArrayToSort = numbersManager.generateNumbers(desiredLength);

			System.out.println("Unsorted Array");
			for(int i = 0; i < generatedArrayToSort.length; i++) {
			    System.out.print(generatedArrayToSort[i] + ",");
			}

			System.out.println("\nChoose Sorting Algorithm");
			System.out.println("Type \n 1 - Bubble Sort \n 2 - Selection Sort");
			int typeOfSort = scanner.nextInt();

			numbersManager.sortNumbers(typeOfSort, generatedArrayToSort);
		}

    }

}
