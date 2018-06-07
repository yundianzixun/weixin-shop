package com.itunion.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// 使用 providers.xml 配置
@ImportResource(value = {"classpath:shop-ds-rovider.xml"})
public class ProviderDSApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderDSApplication.class, args);
	}
}
