package com.nt.util;

import org.apache.commons.codec.binary.Base64;

public class SecureUtil {
	public static String convert(String un,String pwd) {
		//1.concatination
		String auth=new StringBuffer()
				   .append(un).append(":")
				   .append(pwd).toString();
		//encode data
		byte[] arr=Base64.encodeBase64(auth.getBytes());
		//string String
		auth=new String(arr);
		//add prefix Basic<Space>
		auth=new StringBuffer().append("Basic ")
				.append(auth).toString();
		return auth;
	}

}
