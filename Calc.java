package com.lanyu96.test1;

import java.util.Scanner;

/**
 * 该模块的功能是实现计算器功能
 * 
 * 可计算 +, -, *, /, %
 */
public class Calc {
	public static void main(String[] args) {
		System.out.println("--------计算器--------");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Please enter :");
			String s = sc.next();
			if(s.equals("CE")) {
				System.out.println("Stop!");
				break;
			}
			Calculation(s);
		}
	}

	/**
	 * 功能:计算
	 */
	private static void Calculation(String s) {
		if (s.contains("*")) { // 乘法运算
			String[] sp = s.split("\\*");
			int number = Integer.parseInt(sp[0]) * Integer.parseInt(sp[1]);
			System.out.println(sp[0]+"*"+sp[1]+"="+number);
		} else if (s.contains("/")) {// 除法运算
			String[] sp = s.split("\\/");
			int number = Integer.parseInt(sp[0]) / Integer.parseInt(sp[1]);
			System.out.println(sp[0]+"/"+sp[1]+"="+number);
		} else if (s.contains("+")) {// 加法运算
			String[] sp = s.split("\\+");
			int number = Integer.parseInt(sp[0]) + Integer.parseInt(sp[1]);
			System.out.println(sp[0]+"+"+sp[1]+"="+number);
		} else if (s.contains("-")) {// 减法运算
			String[] sp = s.split("\\-");
			int number = Integer.parseInt(sp[0]) - Integer.parseInt(sp[1]);
			System.out.println(sp[0]+"-"+sp[1]+"="+number);
		} else if (s.contains("%")) {// 取余运算
			String[] sp = s.split("\\%");
			int number = Integer.parseInt(sp[0]) % Integer.parseInt(sp[1]);
			System.out.println(sp[0]+"%"+sp[1]+"="+number);
		}else {
			System.out.println("请输入正确的数值!");
		}
	}

	
}
