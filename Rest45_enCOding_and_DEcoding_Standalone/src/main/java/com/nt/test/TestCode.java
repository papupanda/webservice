package com.nt.test;

import org.apache.commons.codec.binary.Base64;

public class TestCode {

	public static void main(String[] args) {
		//encoding steps
		String s1="welcome to nit";
		//String to byte Array
		byte[] a1=s1.getBytes();
		//encode byte Array
		byte[] a2=Base64.encodeBase64(a1);
		//byte array to String
		String s2=new String(a2);
		System.out.println(s2);
		//decoding steps
		byte[] a3=s2.getBytes();
		byte[] a4=Base64.decodeBase64(a3);
		String s3=new String(a4);
		System.out.println(s3);
	}

}
