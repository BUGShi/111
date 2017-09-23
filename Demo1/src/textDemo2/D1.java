package textDemo2;

import java.util.Scanner;

public class D1 {

	/**
	 * 先执行后判断
	 * do{ 循环体 }while(循环条件)
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg;
		do {
			System.out.println("做一套初中的数学题~");
			System.out.println("老师我们做的是否合格:(y/n)");
			msg = sc.next();

		} while (msg.equals("n"));

	}
}
