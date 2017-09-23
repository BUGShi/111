package textDemo1;

import java.util.Scanner;

public class D4 {
	/**
	 * 需求: 早上学理论，下午学开黑 如果老师说通过则不再循环，否则反之
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		// 初始化对象
		Scanner sc = new Scanner(System.in);
		// 询问录入信息
		System.out.println("今天的学习是否合格?(y/n)");
		String answer = sc.next();
		// 循环
		while (answer.equals("n")) {
			System.out.println("早上学理论");
			System.out.println("下午学开黑");
			//迭代
			System.out.println("今天的学习是否合格?(y/n)");
			answer = sc.next();
		}

	}
}
