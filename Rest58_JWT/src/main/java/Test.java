import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Test {

	public static void main(String[] args) {
		String sec="NIT";
		String token =Jwts.builder()
		.setId("1234")
		.setSubject("bms")
		.setIssuer("paytm")
		.setIssuedAt(new Date(System.currentTimeMillis()))
		.setExpiration(new Date(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(1)))
		.signWith(SignatureAlgorithm.HS256,Base64.getEncoder().encode(sec.getBytes()))
		.compact();
		System.out.println(token);
		System.out.println("...............................");
		Claims c=Jwts.parser()
		.setSigningKey(Base64.getEncoder()
		.encode(sec.getBytes()))
		.parseClaimsJws(token)
		.getBody();
		System.out.println(c.getId());
		System.out.println(c.getSubject());
		System.out.println(c.getIssuer());
		System.out.println(c.getIssuedAt());
		System.out.println(c.getExpiration());
		        
		
	}

}
