package system;


public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		
		
//		// ù��° ���
//		Class clazz = Car.class;
//		
//		// �ι�° ���
//		Class clazz = Class.forName("java.lang.String");
//		
//		// ����° ���
		Car c1 = new Car();
		Class clazz = c1.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
