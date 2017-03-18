//constructor overloading
class Area{
    double PI=3.14;
    Area()
    {
	System.out.println("the area");
    }
    Area(int r)
    {
	System.out.println("Area of circle is "+(PI*r*r));
	
    }
    Area(int l,int b)
    {
	System.out.println("Area of rectangle is "+(l*b));
    }
}
class displayArea{

    public static void main(String args[])
    {
	Area a=new Area(2);
       
	
    }
}
