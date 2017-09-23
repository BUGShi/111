package textDemo2;

public class D2 {
	/**
	 * 转换关系：华氏温度 = 摄氏温度 * 9 / 5 + 32
	 * */
	public static void main(String[] args) {
		int hnum = 0;// 华氏温度
		int snum = 0;// 摄氏温度
		int i = 0;// 控制循环次数条件之一

		do {
			hnum = snum * 9 / 5 + 32;
			System.out.println("华氏温度是:" + hnum + "\t摄氏温度" + snum);
			snum += 20;// ===>snum=snum+20
			i++;

		} while (i < 10 && snum <= 250);

	}
}
