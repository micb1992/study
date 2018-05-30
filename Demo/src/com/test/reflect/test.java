package com.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class test {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//加载类方式1
		//Class class1 = Class.forName("com.test.reflect.person");
		//加载类方法2
		//Class class2 = new person().getClass();
		//加载类方法3
		//Class class3 = person.class;
		constructorPublicParameter();
	}
	private static void constructorNoParameter() {
		// TODO Auto-generated method stub
		System.out.println("调用无参构造方法");
		

	}
	private static void constructorPublicParameter() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("反射----获取公共、受保护的构造函数");
		//加载类到内存当中
		Class classConstructorOneParameter = Class.forName("com.test.reflect.person");
		//解析类的构造函数
		Constructor constructor = classConstructorOneParameter.getConstructor(null);
		//调用无参构造函数
		System.out.println("返回无参构造函数"+constructor);
		//创建对象--类型需要强制转换
		person person1 =(person)constructor.newInstance(null);
		//调用构造函数
		person1.person("MI");
		//person1.person(true);
		person1.run();
	
	}

}
