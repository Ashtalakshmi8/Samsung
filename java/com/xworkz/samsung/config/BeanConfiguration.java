package com.xworkz.samsung.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.xworkz.samsung.constants.ApplicationConstants;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.xworkz")
public class BeanConfiguration implements WebMvcConfigurer {
	@Value("Ashta08@outlook.com")
	private String userName;

	@Value("lakshmi8")
	private String password;

	@Value("587")
	private int port;

	@Value("mail.office365.com")
	private String host;

	@Value("smtp")
	private String protocol;

	@Value("true")
	private String auth; // For STARTTLS & DEBUG Also

	public BeanConfiguration() {
		System.out.println("created Bean Configuration");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "register.jsp");
		System.out.println("running View controller");
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		System.out.println("View resolver");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver("/", ".jsp");

		return resolver;
	}

	@Bean
	public JavaMailSenderImpl mailSender() {

		System.out.println("From Java Mail Sender");
		JavaMailSenderImpl mail = new JavaMailSenderImpl();
		mail.setUsername(userName);
		mail.setPassword(password);
		mail.setPort(port);
		mail.setHost(host);

		Properties mailProperties = mail.getJavaMailProperties();
		mailProperties.put(ApplicationConstants.PROTOCOL, protocol);
		mailProperties.put(ApplicationConstants.AUTH, auth);
		mailProperties.put(ApplicationConstants.STARTTLS, auth);
		mailProperties.put(ApplicationConstants.DEBUG, auth);

		return mail;

	}

}