
import java.util.Scanner;
class Area{

    void area(int r)
    //area of circle
    {
       double a=2*3.14*r;
	System.out.println("area of circle is :"+a);
    }

    void area(int l, int b)
    {
	int a=2*(l+b);
	System.out.println("area of rectangle is :"+a);
    }
    public static void main(String args[])
    {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter r=");
		int a = scan.nextInt();
		//	System.out.println("you have entered radius: "+a);
	System.out.println("enter value of length=");
	
	int l=scan.nextInt();

	System.out.println("Enter breadth=");
	int b=scan.nextInt();
	Area areaa= new Area();
	areaa.area(a);
	areaa.area(l,b);
	
//ranjana testing
	
	}


}
