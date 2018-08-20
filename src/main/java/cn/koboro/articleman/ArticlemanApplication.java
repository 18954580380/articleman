package cn.koboro.articleman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "cn.koboro.articleman.mapper", markerInterface=Mapper.class)
public class ArticlemanApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ArticlemanApplication.class, args);
	}
}
