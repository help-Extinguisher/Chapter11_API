package object;

import java.util.Date; // ÀÚ¹Ù ÂÀ À¯Æ¿¿¡ ÀÖ´Â°Å °ñ¶ó¾ß´ï

public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date(); 
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}

}
