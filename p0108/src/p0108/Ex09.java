package p0108;
import java.util.*;
public class Ex09 {

	public static void main(String[] args) {
		Date date1 = new Date();
		//Date date2 = new Date("1970-09-01");
		System.out.println("date1 : " + date1);
		//System.out.println("date2 : " + date2);
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT + 2"));
		System.out.println("시간 : "+ cal.get(Calendar.HOUR_OF_DAY)+":"+cal.getActualMaximum(Calendar.MINUTE));
	}

}
