package textDemo2;

import java.util.Scanner;

public class D1 {

	/**
	 * ��ִ�к��ж�
	 * do{ ѭ���� }while(ѭ������)
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg;
		do {
			System.out.println("��һ�׳��е���ѧ��~");
			System.out.println("��ʦ���������Ƿ�ϸ�:(y/n)");
			msg = sc.next();

		} while (msg.equals("n"));

	}
}
