package first;

import java.util.Scanner;

public class FirstClass {
	public void area(int l,int b)
	{
		
		int area=2*(l+b);
		System.out.println(area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//System.out.println("hello world");
		/*char my_char = 'a';
		int my_integer = 1;
		boolean abc = true;
		System.out.println(my_char);
		System.out.println(my_integer);
		System.out.println(abc);
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length:");
		int length = scan.nextInt();
		/*System.out.println("the value entered is:");
		System.out.println(value);*/
		System.out.println("Enter breadth");
		int breadth = scan.nextInt();
		FirstClass areaa= new FirstClass();
		System.out.println("the area is :");
		areaa.area(length,breadth);
	}

}
