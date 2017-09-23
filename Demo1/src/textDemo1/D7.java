package textDemo1;

import java.util.Scanner;

/**
 * 全屏ctrl+m
 * */
public class D7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("您是否购物:(y/n)");
		String answer = sc.next();//初始化

		//循环条件
		while (answer.equals("y")) {
			/************循环体***************/
			// 制作页面
			System.out.println("***************shoppingMall******************");
			System.out.println("亲爱的用户本商场提供如下商品:");
			System.out.println("1.辣条");
			System.out.println("2.大预祝");
			System.out.println("3.茶叶蛋");
			// 询问所需商品
			System.out.println("请选择:您的商品：");

			int num = sc.nextInt();// 接受用户购买商品的编号
			// 判断用户选择的商品给出响应的价格
			switch (num) {
			case 1:
				System.out.println("为您从马来西亚空运来的辣条一包250$");

				break;
			case 2:
				System.out.println("为你从韩国水路运来的大预祝一箱100$");

				break;
			case 3:
				System.out.println("为你从台湾购买的一大茶叶蛋来了$500");
				break;

			default:
				break;

			}
			//循环迭代
			System.out.println("您还是否购物:(y/n)");
			answer = sc.next();

		}

	}
}
