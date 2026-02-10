package br.com.ati;

import br.com.ati.service.SellerAccountTools;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SbootAtomicoMcpServeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbootAtomicoMcpServeApplication.class, args);
	}

	@Bean
	public ToolCallbackProvider tools (SellerAccountTools sellerAccountTools ) {
		return  MethodToolCallbackProvider. builder ()
				. toolObjects (sellerAccountTools)
				. build ();
	}

}
