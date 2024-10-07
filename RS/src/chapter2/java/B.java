package chapter2.java;

public class B extends A
{
	int num;
	public B(int a,int b)
	{
		super(a);
		this.num=b;
	}
	public void display()
	{
		System.out.println("In A,num"+super.xy);
		System.out.println("In B,num"+num);
	}

}
