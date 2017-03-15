class Aa extends Thread
{
    public void run()
    {
	for(int i=1;i<=3;i++)
	    {
		System.out.println(i);
	    }
    }
}
class Bb extends Thread
{
    public void run()
    {
	for(int i=4;i<=6;i++)
	    {
		System.out.println(i);
	    }
    }
    
}
class nthread
{
    public static void main(String args[])
    {
	Aa a=new Aa();
	Bb b=new Bb();
	a.start();
	b.start();
    }
}
  
