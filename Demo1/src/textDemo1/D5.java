package textDemo1;

public class D5 {
	public static void main(String[] args) {

		// 250000*0.25+25000
		// 人数<1000000

		int persons = 250000;// 初始化
		int year = 0;//要经历的年数
		while (persons < 1000000) {
			persons = (int)(persons * (1 + 0.25));
			year++;
		}
		System.out.println("要经历"+year+"年，才能完成我的目标");

	}
}
