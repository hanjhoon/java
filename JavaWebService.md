# https://tomcat.apache.org/ tomcat 9버전 다운

- ## New Project를 선택해서 새로운 프로젝트를 생성 
  - Maven 빌드 도구를 사용하여 webapp을 생성
  - Name에는 프로젝트명을 적어주고
  - Location에는 프로젝트의 경로를 설정
  - Archetype에서는 'org.apache.maven.archetypes:maven-archetype-webapp'을 선택

  - Advanced Settings를 선택하여 GroupId와 ArtifactId를 설정
  - GroupId는 회사의 도메인을 역순으로
  - ArtifactId는 보통 프로젝트명과 동일하게 사용 
  - Create 버튼을 눌러 프로젝트를 생성

- ## pom.xml
  - pom.xml은 Maven 프로젝트의 설정 파일입니다. 이 파일은 Maven이 프로젝트를 빌드하고 관리하는 데 필요한 정보를 제공한다. 
  - pom.xml 파일에는 다음과 같은 정보가 포함된다.
  - 프로젝트의 이름, 버전, 라이선스 등의 메타데이터
  - 프로젝트의 의존성(dependency) 정보
    - 빌드 설정 정보
    - 프로젝트의 모듈 정보
    - 프로젝트의 리포지토리 정보

# https://mavenrepository.com/

  - # pom.xml
```java
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.playdata</groupId>
  <artifactId>mvn-servlet-webapp</artifactId>
  <packaging>war</packaging>
  <version>1.0-SNAPSHOT</version>
  <name>mvn-servlet-webapp Maven Webapp</name>
  <url>http://maven.apache.org</url>
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
  <build>
    <finalName>mvn-servlet-webapp</finalName>
  </build>
</project>
```


  - # FirstServlet.java 
```java
package com.playdata;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html; charset = UTF-8");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter pw = resp.getWriter();
        pw.println("첫 번째 서블릿 페이지입니다");
    }
}
```

  - # pom.xml에 servlet 추가
```java
<!-- https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api -->
  <dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>4.0.1</version>
    <scope>provided</scope>
  </dependency> 
```

  - # pom.xml에 mariaDB java client 추가
```java
<!-- https://mvnrepository.com/artifact/org.mariadb.jdbc/mariadb-java-client -->
<dependency>
    <groupId>org.mariadb.jdbc</groupId>
    <artifactId>mariadb-java-client</artifactId>
    <version>3.1.3</version>
</dependency>
```
