package com.example.hellospring.service;

import com.example.hellospring.domain.Member;
import com.example.hellospring.repository.MemberRepositoryMemoryImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService;
    MemberRepositoryMemoryImpl memberRepository;

    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemberRepositoryMemoryImpl();
        memberService = new MemberService(memberRepository);
    }

    @AfterEach
    public void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void 회원가입() {
        // given -> 무언가 주어졌는데 (데이터)
        Member member = new Member();
        member.setName("tglee1");

        // when -> 이것을 실행했을 때 (검증하려는 내용)
        Long savedId = memberService.join(member);

        // then -> 결과가 이게 나와야 함 (검증부)
        Member findMember = memberService.findOne(savedId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void 중복_회원_예외() {
        // given
        Member member1 = new Member();
        member1.setName("tglee1");

        Member member2 = new Member();
        member2.setName("tglee1");

        // when
        memberService.join(member1);

        //then
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원 이름입니다.");

//        try {
//            memberService.join(member2);
//            fail();
//        } catch (IllegalStateException e) {
//            // then
//            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원 이름입니다.");
//        }
    }

    @Test
    void 전체회원조회() {
        // given

        // when

        // then
    }

    @Test
    void 회원한명조회() {
        // given

        // when

        // then
    }
}