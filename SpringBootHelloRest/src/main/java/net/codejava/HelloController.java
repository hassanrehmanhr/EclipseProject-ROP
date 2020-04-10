package net.codejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;

import org.apache.tomcat.jni.Socket;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	//Hello World Api for testing
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World RESTful with Spring Boot";
	}
	//Royal Oman Police Report API
	@GetMapping("/RunBatch")
	public String RunBatch(@RequestParam(name = "Account", defaultValue = "0000000000000") String Account) throws IOException {
		//Hi
		//System.out.println("Enter the desired Account Number");
		//BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		//String Account = input.readLine();
		ProcessBuilder processBuilder = new ProcessBuilder(new String[] {"C:\\Users\\Hassan\\Desktop\\RunText.bat"});
		Process process = processBuilder.start();
		return "Done" + Account;
	}
	
}
