package br.com.pdo.ste.config.root;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories(basePackages = { "br.com.produtec.ste.app" })
@EnableTransactionManagement(proxyTargetClass = true)
@Configuration
@ComponentScan(basePackages = {"br.com.pdo.ste.app", "br.com.pdo.ste.config.root"}, scopedProxy = ScopedProxyMode.TARGET_CLASS, excludeFilters = @Filter(Controller.class))
public class RepositoryConfig {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new JpaTransactionManager(entityManagerFactory);
	}

}
