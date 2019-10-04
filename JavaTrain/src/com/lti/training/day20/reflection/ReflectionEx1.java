package com.lti.training.day20.reflection;

import java.lang.reflect.Field;

class Emp{
	public int empno;
}


public class ReflectionEx1 {

	public static void main(String[] args) throws Exception{
		//regular style of creating object and accessing members
		Emp e1 = new Emp();
		e1.empno = 1001;
		System.out.println(e1.empno);
		
		//Using Reflection API to achieve this
		Class<Emp>c = Emp.class;
		Object e2 = c.newInstance();
		Field empno = c.getField("empno");
		empno.set(e2, 1002);
		System.out.println(empno.get(e2));

		
	}

}
