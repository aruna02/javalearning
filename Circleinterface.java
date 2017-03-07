
//interface example
//no defination of method
//all functions should be abstract
interface shape
{
    //double PI=3.1416;
    float PI=3.1415f;
    void findarea();//abstract
}

class Circleinterface implements shape
{
    int r;
    public void findarea()//if not defined any specifier default will be set 
    {
	System.out.println("the area is "+(PI*r*r));
    }
    void setr(int radius)
    {
	r=radius;
    }
    public static void main(String args[])
    {
	Circleinterface c=new Circleinterface();
	c.setr(5);
	c.findarea();
    }

}
