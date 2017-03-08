interface school
{
    void student();
    static int disp(int a)//STATIC method
    {
	return(a+a);
    }
}
class Schooling implements school
{
    public void student()
    {
	System.out.println("students of the school");
    }
}

class Staticinterface
{
    public static void main(String args[])
    {
	school sc=new Schooling();
    
    sc.student();
    System.out.println(school.disp(2));
    }}
