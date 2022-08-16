package com.example.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

    /**
     * 실행하면 TomcatWebServer - Tomcat started on port : 8080(http) 이런식으로 뜨는데
     * 뭔진 모르겠지만 http 로 통신을 했다는 이야기 같음.
     * 웹 브라우저에서 localhost:8080 치면 뭔가 에러뜨면서 페이지 나옴. 이러면 성공한 것임
     * 빌드 완전히 끄고 웹사이트 다시 들어가면 주소 못찾는다고 나옴. 프로젝트 환경설정 성공
     * //
     * 번외로 Java Build 를 하게 되면 intelliJ 로 바로하는게 아니라 gradle 로 할 때가 있는데
     * preference 에서 gradle 검색하고
     * build and run using & run test using 을 intelliJ 로 바꿔주면 됨
     * 이렇게 해야 gradle 통해서 run 할때보다 빨라짐
     * */
    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
    }

}
