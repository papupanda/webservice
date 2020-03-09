package com.nt.helper;

import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.SignatureAlgorithm;

public interface JwtsConst {
	String Secret="NIT";
	String issuer="PayTm";
	SignatureAlgorithm sa=SignatureAlgorithm.HS256;
	int tokExpTime=(int) TimeUnit.MINUTES.toMillis(1);
	
	

}
