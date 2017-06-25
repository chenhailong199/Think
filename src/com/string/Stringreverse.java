package com.string;

import java.util.Scanner;

/**
 * 字符串的反转
 * @author chen
 * @date 2017-06-24
 */
public class Stringreverse {
    public static String reverse(String originStr) {
    	//截取首位放最后,递归
        if(originStr == null || originStr.length() <= 1){
        	return originStr;
        } 
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }
	 
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("输入需反转字符串:");
		String reverStr = input.next();
		System.out.println("反转后:\n"+Stringreverse.reverse(reverStr));
	} 
	 
}
