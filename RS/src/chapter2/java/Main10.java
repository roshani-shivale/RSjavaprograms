package chapter2.java;

public class Main10
	{
 public static void main(String[] args) 
		{
			B obj1=new B(10,20);
			obj1.display();
		}
	}
class A 
{
	int xy;
	public A(int num)
	{
		this.xy=num;
	}

}
class B extends A
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
