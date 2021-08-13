package system;


public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		
		
//		// 첫번째 방법
//		Class clazz = Car.class;
//		
//		// 두번째 방법
//		Class clazz = Class.forName("java.lang.String");
//		
//		// 세번째 방법
		Car c1 = new Car();
		Class clazz = c1.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
