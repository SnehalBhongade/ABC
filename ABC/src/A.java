
public class A {
	
	public void m1()
	{
		System.out.println("I am in non static method");
		int c=0;
		int a=10;
		int b=30;
		c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		System.out.println("Hello Github");
		
		A a = new A();
		a.m1();
		
	}
}
