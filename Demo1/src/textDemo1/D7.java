package textDemo1;

import java.util.Scanner;

/**
 * ȫ��ctrl+m
 * */
public class D7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���Ƿ���:(y/n)");
		String answer = sc.next();//��ʼ��

		//ѭ������
		while (answer.equals("y")) {
			/************ѭ����***************/
			// ����ҳ��
			System.out.println("***************shoppingMall******************");
			System.out.println("�װ����û����̳��ṩ������Ʒ:");
			System.out.println("1.����");
			System.out.println("2.��Ԥף");
			System.out.println("3.��Ҷ��");
			// ѯ��������Ʒ
			System.out.println("��ѡ��:������Ʒ��");

			int num = sc.nextInt();// �����û�������Ʒ�ı��
			// �ж��û�ѡ�����Ʒ������Ӧ�ļ۸�
			switch (num) {
			case 1:
				System.out.println("Ϊ�����������ǿ�����������һ��250$");

				break;
			case 2:
				System.out.println("Ϊ��Ӻ���ˮ·�����Ĵ�Ԥףһ��100$");

				break;
			case 3:
				System.out.println("Ϊ���̨�幺���һ���Ҷ������$500");
				break;

			default:
				break;

			}
			//ѭ������
			System.out.println("�����Ƿ���:(y/n)");
			answer = sc.next();

		}

	}
}
