package p0108;
import java.util.*;
public class Ex10 {

	public static void main(String[] args) {
		Random r1 = new Random();
		Random r2 = new Random(777);
		Random r3 = new Random(777);
		Random r4 = new Random(System.currentTimeMillis());
		System.out.println("## 난수 출력 ##");
		System.out.println("r1 :"+ r1.nextInt(10));
		System.out.println("r2 :"+ r2.nextInt(10));
		System.out.println("r3 :"+ r3.nextInt(10));
		System.out.println("r4 :"+ r4.nextInt(10));
		System.out.println("## 범위 지정 난수 출력 ##");
		System.out.println("1~20 :"+ (r1.nextInt(20)+1));
		

	}

}
