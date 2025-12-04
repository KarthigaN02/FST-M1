package activitities;

public class Activity4{
	public static void main(String[] args) {
		int[] numbers = {9,5,1,4,3};
		System.out.println("Input Array : ");
		printArray(numbers);
		insertionSort(numbers);
		System.out.println("Sorted Array : ");
		printArray(numbers);
	}



	public static void insertionSort(int[] numbers) {
		int size = numbers.length;
		// TODO Auto-generated method stub
		for(int i =1; i<numbers.length; i++)
		{
			int firstNum = numbers[i];
			int j = i-1;
			
			while(j>=0 && numbers[j] > firstNum) 
			{
				numbers[j+1] = numbers[j];
				j--;
			}
			numbers[j+1] =firstNum;
		}
	}
	
	public static void printArray(int[] arr) {
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
}