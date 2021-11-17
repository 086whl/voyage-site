package cn.edu.nuist.voyagesite.util;

import java.security.MessageDigest;

public final class Md5Util {
	private Md5Util(){}
	/**
	 * 将明文密码转成MD5密码 
	 */
	public static String encodeByMd5(String password) throws Exception{
		//Java中MessageDigest类封装了MD5和SHA算法
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		//调用MD5算法
		byte[] byteArray = md5.digest(password.getBytes());
		//注意：MessageDigest只能将String转成byte[]
		return byteArrayToHexString(byteArray);
	}
	/**
	 * 将byte[]转在16进制字符串 
	 */
	private static String byteArrayToHexString(byte[] byteArray) {
		StringBuffer sb = new StringBuffer();
		//遍历
		for(byte b : byteArray){//16次
			//取出每一个byte类型，进行转换
			String hex = byteToHexString(b);
			//将转换后的值放入StringBuffer中
			sb.append(hex);
		}
		return sb.toString();
	}
	/**
	 * 将byte转在16进制字符串 
	 */
	private static String byteToHexString(byte b) {//-31转成e1，10转成0a，。。。
		//将byte类型赋给int类型
		int n = b;
		//如果n是负数
		if(n < 0){
			//转正数
			n = 256 + n;
		}
		//数组的下标
		int d1 = n / 16;
		//数组的下标
		int d2 = n % 16;
		//通过下标取值
		return hex[d1] + hex[d2];
	}
	private static String[] hex = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
	/**
	 * 测试
	 */
	public static void main(String[] args) throws Exception{
		String password = "123";
		String passwordMD5 = Md5Util.encodeByMd5(password);
		System.out.println(password);
		System.out.println(passwordMD5);
	}
}
