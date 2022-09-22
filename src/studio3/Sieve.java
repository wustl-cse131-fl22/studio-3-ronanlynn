package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input number.");
		int n= scan.nextInt();
		int[] numbers = new int[n];
		boolean[] numbersTrue = new boolean[n];
		for (int i=0; i<numbersTrue.length; i++ ) {
			numbersTrue[i]=true;
		}	
		for (int i=0;i<numbers.length;i++) {
			numbers[i]= i+1;
		}
		for(int u= 1; u<numbers.length; u++) {
			for (int i=0; i<numbers.length; i++) {

				if (numbers[i] != 1 && (numbers[i] == (u+1) || numbers[i]%(u+1)!=0)) {
					
						if (numbersTrue[i]==false) {
							numbersTrue[i]= false;
						}
						else{
							numbersTrue[i]= true ;	
						}
					}
				
				else {
					numbersTrue[i]= false;
				}
			}
				
		}
		
		for (int i=0; i<numbers.length; i++) {
			if(numbersTrue[i]==true) {
				System.out.print(numbers[i] + " ");
			}
		}



	}
}
