package net.xiangrou.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("net.xiangrou.web.mapper")//与dao层的@Mapper二选一写上即可(主要作用是扫包)
@EnableTransactionManagement//开启事务管理ß
public class XiangrouApplication {

	public static void main(String[] args) {
		SpringApplication.run(XiangrouApplication.class, args);
	}
}
