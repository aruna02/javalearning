//program to create thread by runnable interface
class Bthread implements Runnable
{
    public void run()
    {
	System.out.println("thread is running");
    }
}

class Threadr
{
    public static void main(String args[])
    {
	Bthread b=new Bthread();
	Thread r=new Thread(b);
	r.start();
    }
}
