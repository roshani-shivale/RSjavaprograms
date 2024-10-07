package chapter1;

public class test25 {
	int x=20; //instance variable

	public static void main(String[] args) {
		test25 t=new test25();
		test25 s=new test25();
		t.x=t.x+20;
		System.out.println(s.x);// TODO Auto-generated method stub

	}

}
