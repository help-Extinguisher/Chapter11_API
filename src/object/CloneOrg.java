package object;

import java.lang.reflect.Array;
import java.util.Arrays;

//class Point {
//	int x, y;
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}


public class CloneOrg {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] arrCopy = arr.clone(); // º¹»ç°¡ µÊ
		for(int i : arrCopy) {
			System.out.print(i + ",");
			
		}
		System.out.println();
		System.out.println(Arrays.toString(arrCopy));

		
	}

}
