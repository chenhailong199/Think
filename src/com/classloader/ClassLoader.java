package com.classloader;

/**
 * 创建对象时构造器的调用顺序是：
 * 先初始化静态成员，然后调用父类构造器，再初始化非静态成员，最后调用自身构造器。
 * @author chen
 *
 */
public class ClassLoader {
    public static void main(String[] args) {
    	A ab = new B();  //1a2b 
        ab = new B();	//2b
	}
	
}

class A {
    static {
        System.out.print("1");
    }
    public A() {
        System.out.print("2");
    }
}

class B extends A{
    static {
        System.out.print("a");
    }
    public B() {
        System.out.print("b");
    }
}