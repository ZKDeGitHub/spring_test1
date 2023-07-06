package com.edu.day0705.config;

import com.alibaba.druid.pool.DruidDataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Author zk
 * @Date 2023/7/5 15:50
 * @注释：
 * @since 11
 */
@Configuration //表明当前类是一个配置类，相当于载入xml头文件
@ComponentScan("com.edu.day0705") // 开启包扫描
@MapperScan("com.edu.day0705.mapper") //载入mapper文件
/*@PropertySource("db.properties")
@EnableAspectJAutoProxy //开启aop注解
@EnableTransactionManagement //开启事务注解*/
public class SpringConfig {
    @Value("${driverClassName}")
    private String driverClassName;
    @Value("${url}")
    private String url;
    @Value("${jdbcUserName}")
    private String jdbcUserName;
    @Value("${password}")
    private String password;


    // 获取数据源的bean，使用的druid（德鲁伊）数据源
    @Bean   //@Bean注解在方法上，声明当前方法返回值是一个bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("driverClassName");
        dataSource.setUrl("url");
        dataSource.setUsername("jdbcUserName");
        dataSource.setPassword("password");
        return dataSource;
    }

    //获取SqlSessionFactory的bean
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());

        //设置实体类的路径
        sqlSessionFactoryBean.setTypeAliasesPackage("com.edu.day0704.entity");

        //开启驼峰标志
        //获取到Configuration
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        //配置驼峰标志开启，此处还可以进行其它配置，将对应的方法添加进configuration即可
        configuration.setMapUnderscoreToCamelCase(true);

        //把配置的规则赋给sqlSessionFactory，这样配置的规则才能生效
        sqlSessionFactoryBean.setConfiguration(configuration);

        return sqlSessionFactoryBean;
    }
}
