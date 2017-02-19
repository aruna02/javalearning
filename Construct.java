class Construct
{
    void display()
    {
	System.out.println("hello");
    }
    void display(int a)
    {
	System.out.println("a="+a);
    }

    void display(double  b)
    {
	System.out.println("float a="+b);
    }
    public static void main(String []args)
    {

	Construct a=new Construct();
	a.display();
	a.display(4.0);
	a.display(4);
    }   
}
