package wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// �ڵ� �ڽ�
		Integer obj = 100; // new Integer(100)�̶� ���� ��������̳���
		System.out.println("value : " + obj.intValue());
		
		// ���Խ� �ڵ� ��ڽ�
		int value = obj; // ���� �;��ϴµ� �ּҰ� �͹��� �ٵ� �ڵ���ڽ��̶� ����
		System.out.println("value : " + value);
		
		// ����� �ڵ� ��ڽ�
		int result = obj + 100;
		System.out.println("result : " + result);
	}

}
