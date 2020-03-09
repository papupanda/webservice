package com.nt.config;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {
	public static String generate(String id,String subject) {
		Date now=new Date(System.currentTimeMillis());
		Date exp=new Date(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(1));
		return Jwts.builder()
				.setId(id)
				.setSubject(subject)
				.setIssuer("paytm")
				.setIssuedAt(now)
				.setExpiration(exp)
				.signWith(SignatureAlgorithm.ES256, Base64.getEncoder().encode("ABC".getBytes()))
				.compact();
	}
	
		public static Claims validate(String token)  {
			return Jwts.parser()
					.setSigningKey(Base64.getEncoder().encode("ABC".getBytes()))
					.parseClaimsJws(token)
					.getBody();
	}

}
