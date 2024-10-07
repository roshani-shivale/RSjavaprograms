package chapter2.java;

class Main1
{
	public static void main(String[] args)
	{
		Subclass2 s=new Subclass2(30,40);
		s.display();
	}
}

 class Superclass2
{
  int x; //instance variable
  Superclass2(int m)
  {
	  x=m;
  }
}
class Subclass2 extends Superclass2
{
	 int y;
	 Subclass2(int m,int n)
	{
		super(m);
		y=n;
	}
	void display()
	{
		System.out.println("x="+x+"y="+y);
	}
}
