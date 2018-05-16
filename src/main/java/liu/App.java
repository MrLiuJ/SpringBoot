package liu;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
//@ComponentScan(basePackages={"liu.controller","liu.service"})
@MapperScan(basePackages= {"liu.mapper"})
/*@EnableJpaRepositories("liu.dao")
@EnableAutoConfiguration
@EntityScan("liu.pojo")	*/
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
	