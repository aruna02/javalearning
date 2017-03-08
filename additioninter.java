//interface example
interface add
{   int a=10,b=20;
    void addition();
}
interface display extends add //extends is use inbtn interfaces
{
    void show();
}
class additioninter implements display //implements is used in between class and interface
{
    int c;
    public void addition()
    {
	c=a+b;	
    }
    public void show()
    {
	System.out.println("the added value is :"+c);
    }
    public static void main(String args[])
    {
	additioninter add1=new additioninter();
	add1.addition();
	add1.show();
	
    }
}
