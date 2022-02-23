package kr.co.etoursoft.tstleaf.common.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration

/*
 * @MapperScan : Mybatis Mapper 연결을 위한 설정
 * Dependency :
 * 		<groupId>org.mybatis.spring.boot</groupId>
 * 		<artifactId>mybatis-spring-boot-starter</artifactId>
 * 		<version>2.1.1</version>
 */
@MapperScan ("kr.co.etoursoft.tstleaf.mapper")
public class MybatisConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setVfs(SpringBootVFS.class);
        sessionFactory.setTypeAliasesPackage("kr.co.etoursoft.tstleaf.dto");
        
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(resolver.getResources("classpath:mapper/**/*.xml"));

        Resource myBatisConfig = new PathMatchingResourcePatternResolver().getResource("classpath:mybatis/mybatis-config.xml");
        sessionFactory.setConfigLocation(myBatisConfig);

        return sessionFactory.getObject();
    }

}
