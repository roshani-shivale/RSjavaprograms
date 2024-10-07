package chapter1;

public class superclass1
{
	int x=100; //instance variable
}
 class subclass extends superclass1
{
	int x=200; //instance variable
	void display() //method
	{
		System.out.println("superclass1 x="+x);
		System.out.println("subclass x="+x);
	}
	class supervariable
	{
	public static void main(String[] args)
	{
	subclass s2=new subclass();
	s2.display();    //method

	}
    }
}