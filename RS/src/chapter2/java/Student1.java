package chapter2.java;

import java.util.*;
import java.util.Iterator;

public class Student1
{
	public static void main(String[] args)
		{
			Student s1=new Student(101,"sonoo",23);
			Student s2=new Student(102,"Ravi",21);
			Student s3=new Student(103,"Hanumant",25);
			
			ArrayList<Student> al=new ArrayList<Student>();
			al.add(s1);
			al.add(s2);
			al.add(s3);
			
			Iterator itr=al.iterator();
			while(itr.hasNext())
			{
				Student st=(Student)itr.next();
				System.out.println(st.rollno+""+st.name+""+st.age);
			}
		}

	}


