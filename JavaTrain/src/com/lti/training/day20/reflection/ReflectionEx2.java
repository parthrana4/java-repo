package com.lti.training.day20.reflection;

import java.lang.reflect.Method;

class Calculator{
	public int add(int x,int  y) {
		return x+y;
		
	}
}


public class ReflectionEx2 {
	
	public static void main(String args[])  throws Exception{
		
		Calculator c1 =new Calculator();
		int res =c1.add(10,20);
		System.out.println(res);
	
		Class calc =Calculator.class;
		Object c2 =calc.newInstance();
		Method m = calc.getMethod("add",int.class,int.class);
		Object result =m.invoke(c2,10,20);
		System.out.println(result);
	}
}
