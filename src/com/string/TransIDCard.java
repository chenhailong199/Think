package com.string;

/**
 * 15位身份证补全为18位身份证算法
 * 15位身份证:AAAAAA YY MM DD NN S (1900-1999)
 * 18位身份证:AAAAAA YYYY MM DD NN S
 * @author chen
 *
 */
public class TransIDCard {
	public static void main(String[] args) {
		System.out.println(transIDCard15to18("370986890623212"));
	    System.out.println(transIDCard15to18("370725881105149"));
	}
	
	public static String transIDCard15to18(String IdCardNO){
		String cardNo = null;
		if (null != IdCardNO && IdCardNO.trim().length()==15){
			IdCardNO = IdCardNO.trim();
			StringBuffer sb = new StringBuffer(IdCardNO);
			sb.insert(6, "19");
			sb.append(transCardLastNo(sb.toString()));
			cardNo = sb.toString();
		}
		return cardNo;
	}
	
	/**
	 * 
	 * 方法用途：15位年份补全‘19’后的身份证号码最后一位校验码
	 * step1、将15位身份证号码加入出生年变为17位
	 * step2、将step1得到的身份证17位数分别乘以不同的系数。从第1位到第17位的系数分别为：
	 *     7-9-10-5-8-4-2-1-6-3-7-9-10-5-8-4-2.
	 * step3、将这17位数字和系数相乘的结果相加
	 * step4、将step3的结果除以11，得出余数
	 * 由于数字的特殊性，这些余数只可能是0-10这11个数字，身份证最后一位的对应数字为1-0-X-9-8-7-6-5-4-3-2.。
	 * 例上面的余数结果为3那么对应身份证号码的最后一位就是9，如果是10，身份证最后一位便是2。    
	 * @return
	 */
	public static String transCardLastNo(String newCardId){
		 char[] ch=newCardId.toCharArray();
		 int m = 0;
		 int[] co = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		 char[] verCode = new char[]{'1','0','X','9','8','7','6','5','4','3','2'};
		 for(int i = 0;i < newCardId.length();i++){
	         m+=(ch[i]-'0')*co[i];
	     }
		 int residue = m % 11;
		 return String.valueOf(verCode[residue]);
	}
	
}


