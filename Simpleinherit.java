import java.util.Scanner;
class A
{
    Scanner scan = new Scanner(System.in);
    int a,b,c,x;
    void setValue()
    {
	System.out.println("Enter a=");
	a=scan.nextInt();
	System.out.println("Enter b=");
	b=scan.nextInt();
	
    }
    void total()
    {
	c=a+b;
    }
  }
class Simpleinherit extends A
{
    void average()
    {
	x=c/2;
	System.out.println("the average of"+" "+a+" "+" "+b+"is"+" "+x);

    }


    public static void main(String args[])
    {
	Simpleinherit bb= new Simpleinherit();
	bb.setValue();
	bb.total();
	bb.average();
	
    }
}
