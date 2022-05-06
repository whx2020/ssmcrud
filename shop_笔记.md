一、引入jar包

spring

springMVC

springJDBC事务控制的

MyBatis

Mysql,连接池c3p0

thymeleaf

日志log4j

分页插件 PageHelper 

前端JQuery , booystarp

```xml
    <dependencies>
        <!-- springMVC -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>4.3.7.RELEASE</version>
        </dependency>
        <!--Spring JDBC  JdbcTemplate-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-jdbc</artifactId>
            <version>4.3.7.RELEASE</version>
        </dependency>
<!--        spring 面向切面编程 aop依赖AspectJ-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-aspects</artifactId>
            <version>4.3.7.RELEASE</version>
        </dependency>

<!--        MyBatis -->
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.4.2</version>
        </dependency>
        <!--        MaBatis整合Spring的适配包-->
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis-spring</artifactId>
            <version>1.3.1</version>
        </dependency>
        <!--        数据量连接池  和  驱动-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.40</version>
        </dependency>
        <dependency>
            <groupId>c3p0</groupId>
            <artifactId>c3p0</artifactId>
            <version>0.9.1.2</version>
        </dependency>
        <!-- Spring5和Thymeleaf整合包 -->
        <dependency>
            <groupId>org.thymeleaf</groupId>
            <artifactId>thymeleaf-spring5</artifactId>
            <version>3.0.12.RELEASE</version>
        </dependency>
<!--    开发web servlet-api -->
        <!-- ServletAPI -->
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>3.1.0</version>
            <scope>provided</scope>
        </dependency>

<!--        分页插件-->
        <dependency>
            <groupId>com.github.pagehelper</groupId>
            <artifactId>pagehelper</artifactId>
            <version>5.2.0</version>
        </dependency>
        <!-- junit测试 -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
        <!-- log4j日志 -->
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.17</version>
        </dependency>
    </dependencies>
```

二、ssm整合配置

web.xml

spring.xml

springmvc.xml

Mybatis.xml

三、使用逆向工程创建Bean dao Mapper

四、Product 中补入Brand属性

ProductMapper配置下联合查询

五、MapperTest测试联合查询

六、测试PageHelper插件

```java
PageInfo{pageNum=1, pageSize=3, size=3, startRow=1, endRow=3, total=8, pages=3, list=Page{count=true, pageNum=1, pageSize=3, startRow=0, endRow=3, total=8, pages=3, reasonable=true, pageSizeZero=false}[Product{productId=1, productName='魅族 MX5 16GB 银黑色', productBrand=2, productPrice=1899.0, productImg='products/c_0006.jpg', productDesc='魅族 MX5 16GB 银黑色 移动联通双4G手机 双卡双待送原厂钢化膜+保护壳+耳机！5.5英寸大屏幕，3G运行内存，2070万+500万像素摄像头！长期省才是真的省！', brand=Brand{brandId=2, brandName='魅族'}}, Product{productId=2, productName='三星 Galaxy On7', productBrand=3, productPrice=1398.0, productImg='products/c_0007.jpg', productDesc='三星 Galaxy On7（G6000）昂小七 金色 全网通4G手机 双卡双待新品火爆抢购中！京东尊享千元良机！5.5英寸高清大屏！1300+500W像素！评价赢30元话费券！', brand=Brand{brandId=3, brandName='三星'}}, Product{productId=3, productName='HTC One M9+', productBrand=7, productPrice=3499.0, productImg='products/c_0001.jpg', productDesc='HTC One M9+（M9pw） 金银汇 移动联通双4G手机5.2英寸，8核CPU，指纹识别，UltraPixel超像素前置相机+2000万/200万后置双镜头相机！降价特卖，惊喜不断！', brand=Brand{brandId=7, brandName='HTC'}}], prePage=0, nextPage=2, isFirstPage=true, isLastPage=false, hasPreviousPage=false, hasNextPage=true, navigatePages=8, navigateFirstPage=1, navigateLastPage=3, navigatepageNums=[1, 2, 3]}

```







