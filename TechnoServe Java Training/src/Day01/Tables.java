package Day01;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 1, num, j;
		System.out.println("Enter a number: ");
		j = sc.nextInt();
		System.out.println();
		System.out.println(j + "'s Table \n");
		for(i=1;i<=10;i++) {
			num = (j * i);
			System.out.println(j + " * " + i + " = " + num);
		}

	}
}
