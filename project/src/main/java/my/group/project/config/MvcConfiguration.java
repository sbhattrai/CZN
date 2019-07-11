package my.group.project.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import my.group.project.Dao.SuperHeroDao;
import my.group.project.Dao.SuperHeroDaoDatabase;
import my.group.project.Service.SuperHeroService;
import my.group.project.Service.SuperHeroServiceImpl;

@Configuration
@ComponentScan(basePackages="my.group.project")
@EnableWebMvc
public class MvcConfiguration implements WebMvcConfigurer{

	
	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
	public MultipartResolver multipartResolver(){
		return new CommonsMultipartResolver();
	}
	
	@Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/superherodatabase?serverTimezone=America/Chicago");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
 
        return dataSource;
    }
	@Bean
	public JdbcTemplate jdbcTemplate() {
	    return new JdbcTemplate(getDataSource());
	}
	
	@Bean
	public SuperHeroDao superheroDao() {
		SuperHeroDaoDatabase s = new SuperHeroDaoDatabase();
		return s ;
	}
	
	@Bean
	public SuperHeroService superheroService() {
		SuperHeroServiceImpl s = new SuperHeroServiceImpl();
		return s;
	}
	
}

	
	
	
	
	

