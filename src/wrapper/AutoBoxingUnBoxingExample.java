package wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// 자동 박싱
		Integer obj = 100; // new Integer(100)이랑 같음 오토빡씽이네잉
		System.out.println("value : " + obj.intValue());
		
		// 대입시 자동 언박싱
		int value = obj; // 값이 와야하는데 주소가 와버림 근데 자동언박싱이라 ㅇㅋ
		System.out.println("value : " + value);
		
		// 연산시 자동 언박싱
		int result = obj + 100;
		System.out.println("result : " + result);
	}

}
