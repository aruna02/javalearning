class practice
{
      int a;
     String b;
      double c;

     void name(String namee)
     {
	 b=namee;
     }

    
    void get(int b)
    {
	a=b;
    }
    void display()
    {
	System.out.println("your name is "+b);
	System.out.println("you have entered " +a);
	
    }
    public static void main(String args[])
    {
	practice x =new practice();
	x.name("aruna");
	x.get(2);
	x.display();
    }
}
