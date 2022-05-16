package javaexamples;

public class E {
public static void main(String[] args) {
	int a=20;
	int b=30;
	int c=0;
	System.out.println("before swaping"+a+" "+b);
	
	c=a;
	a=b;
	b=c;
	System.out.println("after swaping"+a+" "+b);
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println(a+" "+b);
}
}
