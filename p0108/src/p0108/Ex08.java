package p0108;

public class Ex08 {

	public static void main(String[] args) {
		Integer num1 = new Integer(30);
		Integer num2 = num1.intValue();
		Integer num3 = 50;
		
		int num4 = num3;
		String num5 = "40";
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
	    Double result = Double.parseDouble(num5);
		System.out.println("result : "+result);
		System.setProperty("user","홍길동");
		System.out.println("PATH 환경변수"+System.getenv("PATH"));
		System.out.println("USER 환경변수"+System.getProperty("user"));
	}

}
