# ssm-demo
# spring-springmvc-mybatis 搭建环境

sourcefolder:
src/main/resources/generator:该文件夹为mybatis自带自动生成dao,model，mapper模块代码文件的工具

配置文件：
spring.xml：容器文件，主要配置一些bean对象，包括数据源，sqlSessionFactory，配置mybatis mapper接口

spring-mvc：主要配置一些spring-mvc一些配置

spring-mybatis.xml：主要配置一些mybatis实体类映射文件，以及别名通过标签
<mapper></mapper>
<typeAliases> </typeAliases> 
