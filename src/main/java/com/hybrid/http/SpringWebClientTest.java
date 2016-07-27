package com.hybrid.http;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

public class SpringWebClientTest {

	public static void main(String[] args) {
//		GET();
		POST();
	}
	static void GET(){
		System.out.println("START SPRING");
		RestTemplate rest = new RestTemplate();
		String body = rest.getForObject("http://localhost:8080/Hello.jsp?name={name}&addr={addr}", String.class,"홍 길 동","서울 마포구");
		System.out.println(body);
		System.out.println("END SPRING");
	}
	static void POST(){
		System.out.println("START SPRING");
		RestTemplate rest = new RestTemplate();
		
		LinkedMultiValueMap<String, String> params = new LinkedMultiValueMap<>();
		params.add("name", "홍순이");
		params.add("addr", "서울시 강북구");
		
		String body = rest.postForObject("http://localhost:8080/Hello.jsp", params, String.class);
		System.out.println(body);
		System.out.println("END SPRING");
	}
}
