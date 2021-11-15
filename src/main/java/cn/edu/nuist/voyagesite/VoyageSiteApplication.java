package cn.edu.nuist.voyagesite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@MapperScan
@SpringBootApplication
public class VoyageSiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoyageSiteApplication.class, args);
    }

}
