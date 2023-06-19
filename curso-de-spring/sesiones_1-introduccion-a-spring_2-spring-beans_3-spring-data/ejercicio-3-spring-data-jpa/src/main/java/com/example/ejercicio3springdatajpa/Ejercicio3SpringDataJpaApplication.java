package com.example.ejercicio3springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3SpringDataJpaApplication {

	public static void main(String[] args) {
		/*
			Ejercicio 3

			Crear un proyecto Spring Boot con las dependencias:
			Spring Data JPA
			H2

			En caso de querer que la base de datos se guarde en disco habrá que añadir las siguientes propiedades
			en el archivo application.properties:

			spring.jpa.show-sql=true
			spring.datasource.url=jdbc:h2:file:C:/data/sample
			spring.datasource.username=sa
			spring.datasource.password=
			spring.datasource.driverClassName=org.h2.Driver
			#spring.jpa.hibernate.ddl-auto=creat
			spring.jpa.hibernate.ddl-auto=update
			spring.sql.init.mode=always
			spring.jpa.defer-datasource-initialization=true
		 */

		ApplicationContext applicationContext = SpringApplication.run(Ejercicio3SpringDataJpaApplication.class, args);

		UserRepository userRepository = applicationContext.getBean(UserRepository.class);

		System.out.println("Number of users in the DB: " + userRepository.count());

		User user = new User(null, "Nestor", "miemail@example.com", "1234");
		User user2 = new User(null, "Juan", "juan@example.com", "qwerty");
		User user3 = new User(null, "Pedro", "pedro@example.com", "ytrewq");

		userRepository.save(user);
		userRepository.save(user2);
		userRepository.save(user3);

		System.out.println("Number of users in the DB: " + userRepository.count());
		System.out.println(userRepository.findAll());
	}

}
