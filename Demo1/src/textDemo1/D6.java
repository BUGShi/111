package textDemo1;

public class D6 {
	/**
	 * 计算100以内的偶数之和
	 * */
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;//求和
		while (i <= 100) {
			sum+=i;
			i = i + 2;
		}
		System.out.println("i:"+i);
		System.out.println("偶数之和"+sum);

	}
}
