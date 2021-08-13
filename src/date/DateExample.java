package date;

import java.text.*;
import java.util.*;


public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf =
				// 지정한 형식대로 출력할수 있다 (년도를 뒤에 붙인다던가)
				new SimpleDateFormat("hh시 mm분 ss초 / MM월 dd일 yyyy년");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
	}

}
