package textDemo2;

public class D2 {
	/**
	 * ת����ϵ�������¶� = �����¶� * 9 / 5 + 32
	 * */
	public static void main(String[] args) {
		int hnum = 0;// �����¶�
		int snum = 0;// �����¶�
		int i = 0;// ����ѭ����������֮һ

		do {
			hnum = snum * 9 / 5 + 32;
			System.out.println("�����¶���:" + hnum + "\t�����¶�" + snum);
			snum += 20;// ===>snum=snum+20
			i++;

		} while (i < 10 && snum <= 250);

	}
}
