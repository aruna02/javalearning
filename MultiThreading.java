//multithreading in java

class  Test1 extends Thread
{
    public void run()
    {
	for(int  i=1;i<=5;i++)
	    {	try{Thread.sleep(20);}catch(Exception e) {}//sleep for 20ms and at that time next method execute
	    System.out.println(i);	    
}
	
    }
}
 class Test2 extends Thread
 {
     public void run()
     {
	 for(int i=6;i<=10;i++)
	     {
		 	try{
			    Thread.sleep(20);}
			catch(Exception e) {}
		 System.out.println(i);
	     }
     }
 }

class MultiThreading
{

    public static void main(String args[])
    {
	Test1 t1=new Test1();
	Test2 t2=new Test2();
	t1.start();

	t2.start();

    }
			    
}
