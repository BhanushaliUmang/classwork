package com.example.email;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailApplication {

	public static void main(String[] args) {

		 System.out.println("This application is supposed to send mails");

        HandleMail mailer = new HandleMail();
        mailer.sendMail();
	}

}
