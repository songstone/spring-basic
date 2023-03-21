package com.example.springbasic;

import com.example.springbasic.member.Grade;
import com.example.springbasic.member.Member;
import com.example.springbasic.member.MemberService;

public class MemberApp {

    public static void main(String[] args) {

        AppConfig config = new AppConfig();

        MemberService memberService = config.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member : " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
