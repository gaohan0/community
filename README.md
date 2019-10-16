## 码匠社区

## 资料
[Spring文档](https://spring.io/guides)

[SpringWeb文档](https://spring.io/guides/gs/serving-web-content/)

[es社区](https://elasticsearch.cn/explore/)

[github Ourth](https://developer.github.com/apps/building-github-apps/creating-a-github-app/)

[bootstrap](https://v3.bootcss.com/)

[flyway](https://flywaydb.org/getstarted/firststeps/maven#migrating-the-database)
## 工具

##脚本
```sql
create table USER
(
    ID           int default  auto_increment,
    ACCOUNT_ID   VARCHAR(100),
    NAME         VARCHAR(50),
    TOKEN        CHAR(36),
    GMT_CREATE   BIGINT,
    GMT_MODIFIED BIGINT,
    constraint USER_PK
        primary key (ID)
);

```
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate