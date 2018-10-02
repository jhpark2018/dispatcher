package p0108;

public class eX06 {
	public int sum(int num1,int num2) {
		return num1 + num2;
	}
	public double sum(int num1,double num2) {
		return num1 + num2;
	}
	public double sum(double num1,int num2) {
		return num1 + num2;
	}
	public double sum(double num1,double num2) {
		return num1 + num2;
	}
	public int min(int num1,int num2) {
		return num1 - num2;
	}
	public double min(int num1,double num2) {
		return num1 - num2;
	}
	public double min(double num1,int num2) {
		return num1 - num2;
	}
	public double min(double num1,double num2) {
		return num1 - num2;
	}
	public int mul(int num1,int num2) {
		return num1 * num2;
	}
	public double mul(int num1,double num2) {
		return num1 * num2;
	}
	public double mul(double num1,int num2) {
		return num1 * num2;
	}
	public double mul(double num1,double num2) {
		return num1 * num2;
	}
	public static void main(String[] args) {
		eX06 exam = new eX06();
		System.out.println(exam.sum(8,5));
		System.out.println(exam.sum(8,5.5));
		System.out.println(exam.sum(8.8,5));
		System.out.println(exam.sum(8.8,5.5));
		System.out.println(exam.min(8,5));
		System.out.println(exam.min(8,5.5));
		System.out.println(exam.min(8.8,5));
		System.out.println(exam.min(8.8,5.5));
		System.out.println(exam.mul(8,5));
		System.out.println(exam.mul(8,5.5));
		System.out.println(exam.mul(8.8,5));
		System.out.println(exam.mul(8.8,5.5));

	}

}
