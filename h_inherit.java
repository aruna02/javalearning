//hierarchical inheritance
class A
{
    int a,b;
    void setvalue()
    {
   	 a=10;
	 b=20;
    }
}
class B extends A
{
    void sum()
    {
	System.out.println("sum is :" +(a+b));
	
    }
}
class C extends A

{
    void multiply()
    {
	System.out.println("Multiplication is: "+(a*b));
    }
}

class h_inherit
{

    public static void main(String args[])
    {

	B b1 = new B();
	C c1= new C();
	b1.setvalue(); //object of class B call the setvalue method of class A
	b1.sum();
	c1.setvalue(); //object of class C call the setvalue method of class A
	c1.multiply();
    }
}
