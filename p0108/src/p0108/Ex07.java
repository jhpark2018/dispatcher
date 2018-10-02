package p0108;

public class Ex07 {

	public static void main(String[] args) {
		String str1 = "helloWorld";
		String str2 = "hello";
		String str3 = new String("hello");
		String gu;
		if(str1==str2) {
			System.out.println("str1과 str2는 같습니다.");
		}
		else
		{
			System.out.println("str1과 str2는 같지 않습니다.");
		}
		if(str1==str3) {
			System.out.println("str1과 str2는 같습니다.");
		}
		else
		{
			System.out.println("str1과 str2는 같지 않습니다.");
		}
		if(str1.equals(str3)) {
			System.out.println("str1과 str2는 같습니다.");
		}
		else
		{
			System.out.println("str1과 str2는 같지 않습니다.");
		}
		gu=str1.substring(6,7);
		if(gu.equals("1"))
		   System.out.println("남성");
		else
			System.out.println("여성");
		System.out.println("replace : "+str1.replace("l", "L"));
	}

}
