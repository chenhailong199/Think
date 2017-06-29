package com.string;

import org.apache.commons.lang.StringUtils;

/**
 * 计算一个字符串某个字符的出现次数
 * 使用apache commons lang包中的StringUtils
 * @author chen
 *
 */
public class CountChar {
	public static void main(String[] args) {
		int n = StringUtils.countMatches("fjgnkjowefkmnfsdlfopew", "j");
		System.out.println(n);
		
		//重复一个字符串
		String str = "abcd";
		String repeated = StringUtils.repeat(str,3);
		System.out.println(repeated);
	}
}
