// program to create thread extending a thread class 
 class A extends Thread
 {
     public void run()
     {
	 System.out.println("Thread running");
     }
 }
class thread
{
    public static void main(String args[])
    {
	A a=new A();
	a.start();
    }
}
