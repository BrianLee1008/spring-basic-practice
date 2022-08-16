package com.example.hellospring;

import com.example.hellospring.repository.MemberRepository;
import com.example.hellospring.repository.MemberRepositoryMemoryImpl;
import com.example.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemberRepositoryMemoryImpl();
    }
}
