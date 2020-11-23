package com.nat.springbootdemo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nat.springbootdemo.model.Product;
import com.nat.springbootdemo.service.ProductService;



@SpringBootApplication
// 1. @SpringBootConfiguration === @Configuration
// 2. @EnableAutoConfiguration	- it enables spring boot to auto-configure the application context. it automatically creates and register beans based on both
//		the included jar files in the classpath & beans defined by us.
//Spring MVC ===> spring web jar and tomcat server plugin.
// when spring web starter ===> it will include the tomcat server mvc based config.
// exclude names autoconfig we want to skip specify that list to @enableautoconfiguration
// 3. @ComponentScan
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args);
		
		ProductService productService = context.getBean(ProductService.class);
		ProductService productService2 = context.getBean(ProductService.class);
		Product product = new Product(2 ,"laptop modified", "i5 10th gen", 123.0f, "mac");
		String result = productService.createProduct(product);
		System.out.println(result);
		System.out.println(productService.equals(productService2));
		System.out.println(productService == productService2);
		
		Optional<List<Product>> optional = productService.getProductsByCategory("mac");
		if(optional.isPresent()) {
			List<Product> products = optional.get();
			products.forEach(p ->{
				System.out.println(p);
			});
		}else {
			System.out.println("not available");
		}
		
		
//		if(productService.getProductById(5).isPresent()) {
//			System.out.println("product exist");
//		}else {
//			System.out.println("not available");
//		}
//		context.close();
//		String [] beanNames = applicationContext.getBeanDefinitionNames();
//		
//		Arrays.sort(beanNames);
//		
//		for(String beanName : beanNames) {
//			System.out.println(beanName);
//		}
	}

}
