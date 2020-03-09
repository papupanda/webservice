package com.nt.helper;

import java.util.Base64;
import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JwtHelper {

	public String issueToken(String id,String subject) {
		Date now=new Date(System.currentTimeMillis());
		Date exp=new Date(System.currentTimeMillis()+JwtsConst.tokExpTime);
		
		return Jwts.builder()
				.setId(id)
				.setSubject(subject)
				.setIssuer(JwtsConst.issuer)
				.setIssuedAt(now)
				.setExpiration(exp)
				.signWith(JwtsConst.sa, Base64.getEncoder().encode(JwtsConst.Secret.getBytes())
						)
				.compact();
	}
	public Claims validateToken(String token) {
		return Jwts.parser()
				.setSigningKey(Base64.getEncoder()
						.encode(JwtsConst.Secret.getBytes())
						)
				.parseClaimsJws(token)
				.getBody();
	}
	public String readSub(String token) {
       Claims c=validateToken(token);
		return c.getSubject();
	}
	public String readId(String token) {
		Claims c=validateToken(token);
		return c.getId();
	}
	

}
