package textDemo1;

public class D5 {
	public static void main(String[] args) {

		// 250000*0.25+25000
		// ����<1000000

		int persons = 250000;// ��ʼ��
		int year = 0;//Ҫ����������
		while (persons < 1000000) {
			persons = (int)(persons * (1 + 0.25));
			year++;
		}
		System.out.println("Ҫ����"+year+"�꣬��������ҵ�Ŀ��");

	}
}
