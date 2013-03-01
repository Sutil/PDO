package br.com.pdo.ste.config.root;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.aspectj.EnableSpringConfigured;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

@EnableSpringConfigured
@ComponentScan(basePackages = { "br.com.produtec.ste.app", "br.com.pdo.ste.config.root" }, scopedProxy = ScopedProxyMode.TARGET_CLASS, excludeFilters = @Filter(Controller.class))
@Configuration
public class SteConfig {

	@Autowired
	private DataSource dataSource;

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}

}