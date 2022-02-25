package Day01;

import java.util.Scanner;

public class Prime_Numbers {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, m=0, count = 0;
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		m = n/2;
		if(n==0||n==1) {
			System.out.println(n+" not a prime number");
		}
		else {
			for(i = 2 ; i <= m; i++) {
				if(n%i==0) {
					System.out.println(n + " not a prime number");
					count = 1;
					break;
				}
			}
			if(count == 0 ) {
				System.out.println(n +" is a prime number");
			}
		}
	}

}
