package textDemo1;

public class D6 {
	/**
	 * ����100���ڵ�ż��֮��
	 * */
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;//���
		while (i <= 100) {
			sum+=i;
			i = i + 2;
		}
		System.out.println("i:"+i);
		System.out.println("ż��֮��"+sum);

	}
}
