package com.edu.day0705.config;

import com.alibaba.druid.pool.DruidDataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;
import javax.sql.DataSource;

/**
 * @Author zk
 * @Date 2023/7/5 15:50
 * @注释：
 * @since 11
 */
@Configuration //表明当前类是一个配置类，相当于载入xml头文件
@ComponentScan(basePackages = {"com.edu.day0705"}) // 开启包扫描
@MapperScan("com.edu.day0705.mapper") //载入mapper文件

public class SpringConfig {
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_mybatis?serverTimezone=Asia/Shanghai");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }

    @Bean("sqlSessionFactoryBean")
    public SqlSessionFactoryBean getSessionFactory() {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        //设置别名
        sqlSessionFactoryBean.setTypeAliasesPackage("com.edu.day0705.entity");
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        //设置驼峰标志的
        configuration.setMapUnderscoreToCamelCase(true);
        sqlSessionFactoryBean.setConfiguration(configuration);
        return sqlSessionFactoryBean;
    }

}
