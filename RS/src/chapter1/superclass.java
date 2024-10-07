package chapter1;

public class superclass {
	int x;  //instane variable
	superclass(int m) //parameterized constructor
	{
		x=m;
	}
	class subclass extends superclass
	{
		int y; //instance variable
		subclass(int m,int n) //parameterized constructor
		{
			super(m);
			y=n;
		}
		void display()
		{
			System.out.println("x="+x+"y"=+y);
		}
	}
	public class main
	{
	public static void main(String[] args)
	{
	   subclass obj1=New subclass(10,20);
	   obj.display()/
	// TODO Auto-generated method stub

	}

}
