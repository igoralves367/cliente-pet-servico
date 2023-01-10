package br.com.anakarolini.clientepetservico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClientePetServicoApplication {
		public static void main(String[] args) {
		SpringApplication.run(ClientePetServicoApplication.class, args);
	}
}