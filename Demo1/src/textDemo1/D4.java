package textDemo1;

import java.util.Scanner;

public class D4 {
	/**
	 * ����: ����ѧ���ۣ�����ѧ���� �����ʦ˵ͨ������ѭ��������֮
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		// ��ʼ������
		Scanner sc = new Scanner(System.in);
		// ѯ��¼����Ϣ
		System.out.println("�����ѧϰ�Ƿ�ϸ�?(y/n)");
		String answer = sc.next();
		// ѭ��
		while (answer.equals("n")) {
			System.out.println("����ѧ����");
			System.out.println("����ѧ����");
			//����
			System.out.println("�����ѧϰ�Ƿ�ϸ�?(y/n)");
			answer = sc.next();
		}

	}
}
