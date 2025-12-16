package ArrayConcepts;

public class CountTheNumberEvenAndOdd {

	public static void main(String[] args) {

		int arr[] = {3, 5, 7, 32, 75, 245, 43, 12};

        int evenCount = 0;
        int oddCount = 0;

        System.out.print("Even numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                evenCount++;
            }
        }

        System.out.println("\nOdd numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                oddCount++;
            }
        }

        System.out.println("\n\nCount of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
    }
}