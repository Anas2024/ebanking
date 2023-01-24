package org.sid.ebanking;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EbankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbankingApplication.class, args);
	}
	 @Bean
	    CommandLineRunner commandLineRunner()
	    {
		 return args ->
		 {
			 
		 };
		 
	    }

}
