package activitities;

public class Activity2{
	public static void main(String[] args) {
		//inititalize the array
		int[] numbers = {10,77,10, 54, -11, 10};
		int i;
		int sum =0;
	
		System.out.println("Sum = "+ checkSum(numbers,10, 30));
	}
	
	public static boolean checkSum(int[] numbers, int searchValue, int sum1) {
		sum1 = 0;
		for(int number: numbers) {
			if(number == searchValue) {
				sum1 = sum1+searchValue;
						
			}
		}
		if(sum1 == 30) {
			System.out.println("Sum is 30");
			return true;
		}
		else {
			System.out.println("Sum is NOT 30");
			return false;
		}
		
		
	}
	
}