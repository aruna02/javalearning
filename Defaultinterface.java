interface school
{
    void student();
    default void classes()//default method
    {
	System.out.println("classes in school");
    }
}
class Schooling implements school
{
    public void student()
    {
	System.out.println("students of the school");
    }
}

class Defaultinterface
{
    public static void main(String args[])
    {
    Schooling sc=new Schooling();
    sc.classes();
    sc.student();
    }}
