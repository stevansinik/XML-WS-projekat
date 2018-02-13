package configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("data.repository")
public class PersistenceConfig {
	@Autowired
    private DataSource dataSource;
    @Autowired
    private JpaVendorAdapter jpaVendorAdapter;
    @Autowired
    private Properties jpaProperties;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
        emfb.setDataSource(dataSource);
        emfb.setPackagesToScan(new String[] {"data.entity"});
        emfb.setJpaVendorAdapter(jpaVendorAdapter);
        emfb.setJpaProperties(jpaProperties);
        return emfb;
    }

    @Bean
    public HibernateJpaVendorAdapter hjpa() {
        HibernateJpaVendorAdapter hjpa = new HibernateJpaVendorAdapter();
        hjpa.setDatabase(Database.MYSQL);
        hjpa.setGenerateDdl(true);
        hjpa.setShowSql(true);
        return hjpa;
    }
    
    
    @Bean
    public Properties devHibernateJpaProperties() {
        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        jpaProperties.put("hibernate.show_sql", true);
        jpaProperties.put("hibernate.hbm2ddl.auto", "create-drop");
        return jpaProperties;
    }
	@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/firma");
        dataSource.setUsername("root");
        dataSource.setPassword("bilosta");
        return dataSource;
    }
    
    @Bean
    public JpaTransactionManager transactionManager() {
        JpaTransactionManager txMngr = new JpaTransactionManager();
        txMngr.setEntityManagerFactory(entityManagerFactory().getObject());
        return txMngr;
    }
    
    /*
    @Bean
    public Properties presHibernateJpaProperties() {
        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        jpaProperties.put("hibernate.show_sql", true);
        jpaProperties.put("hibernate.hbm2ddl.auto", "create-drop");
        return jpaProperties;
    }

    @Bean
    public DataSource dataSource() {
        EmbeddedDatabaseBuilder edBuild = new EmbeddedDatabaseBuilder();
        return edBuild.setType(EmbeddedDatabaseType.H2).build();
    }
     */
}
