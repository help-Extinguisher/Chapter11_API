package date;

import java.text.*;
import java.util.*;


public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf =
				// ������ ���Ĵ�� ����Ҽ� �ִ� (�⵵�� �ڿ� ���δٴ���)
				new SimpleDateFormat("hh�� mm�� ss�� / MM�� dd�� yyyy��");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
	}

}
