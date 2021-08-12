package object;

class A {
	char ch;
	public A(char ch) {
		this.ch = ch;
	}
}

public class StringOrg {
	public static void main(String[] args) {
		
		A type1 = new A('¢Ë');
		A type2 = new A('¢Ë');
		
		
		System.out.println(type1);
		System.out.println(type2);
		
		System.out.printf("%x\n", type1.hashCode());
		System.out.printf("%x\n", type2.hashCode());
		
		String str = "korea";
		System.out.println(str.toString());
	}

}
