package com.app.assasement;

import com.app.manager.ConnectionManager;
import com.app.manager.EncryptionManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssasementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssasementApplication.class, args);
		EncryptionManager.getInstance();
		ConnectionManager.getInstance();
	}

}
