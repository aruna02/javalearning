interface first
{
    void display();
}
interface second
{
    void show();
}
class third implements first,second
{
    public void display()
    {
	System.out.println("this is first interface");
    }
    public void show()
    {
	System.out.println("this is second interface");
    }
    
}
class multi_inherit
{
    public static void main(String args[])
    {
	third third1=new third();
	third1.display();
	third1.show();
    }
}
