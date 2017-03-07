// interface for multiple inheritance

interface calcu
{
    //int a;
    void setdata(int A);//abstract method
}

interface nextcalcu
{
    
    // int b;// these are static datatype
    void setdata(int B);//abstract method
}

class calculate implements calcu,nextcalcu
{
    int c;
public void setdata(int C)

{
c=C;
System.out.print("data is "+c);
}
public static void main(String args[])
{
    calculate cal= new calculate();
    cal.setdata(2);
}

}
