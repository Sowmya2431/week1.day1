package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int a = 0;
		int b = 1;
		{
		System.out.println(a);
		System.out.println(b);

		}
		for (int i = 2; i < range; ++i)
		{
			int sum = a+b;
	        System.out.println(sum);
	        
	        a = b;
	        b = sum;
	        
			
			
		}
	
	}
		

			
	}
