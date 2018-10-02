package p0108;

public class Ex05 {
	int num1;
	int num2;
	final float PI =3.14F;
	public static void main(String[] args) {
		Ex05 ex1 = new Ex05();
		Ex05 ex2 = new Ex05();
		
		ex1.num1 = 20;
		ex2.num1 = 30;
		//ex1.PI = 3.14159F;
		System.out.println("ex1.num1 ="+ ex1.num1);
		System.out.println("ex2.num1 ="+ ex2.num1);
		ex1.num2 = 30;
		ex2.num2 = 50;
		System.out.println("ex1.num2 ="+ ex1.num2);
		System.out.println("ex2.num2 ="+ ex2.num2);
	}

}
