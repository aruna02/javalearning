//program showing multilevel inheritance
class display
{
  static int a=10, b=20;
    display()
    {
	System.out.println("the value of a is : "+a);
	System.out.println("the value of b is :"+b);
    }
    void  increment()
    {
	a=a+1;
	b=b+1;
	System.out.println(" after increment the value of a and b is "+a+" "+b);
    }
}
class A extends display
{
    int c;

    A()
    {
	System.out.println("this is class A");
    }
    void add()
    {
	c=a+b;
	System.out.println("addition is "+ c);
    }
    
	
}
class Multilevelinherit extends A
{
   Multilevelinherit()
    {
	System.out.println("this is class B");
    }
    public static void main(String args[])
    {

	Multilevelinherit b1= new Multilevelinherit();
	b1.add();
	b1.increment();
	Multilevelinherit b2 = new Multilevelinherit();
	b2.increment();	
	
    }
}
