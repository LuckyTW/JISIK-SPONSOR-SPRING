package com.codestates.jisik_sponsor.member.service;

import com.codestates.jisik_sponsor.member.entity.Member;
import com.codestates.jisik_sponsor.member.repository.MemberRepository;
import com.codestates.jisik_sponsor.utils.CustomBeanUtils;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@AllArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final CustomBeanUtils<Member> beanUtils;

    // 사용자 공개 프로필 조회
    public Member findMemberProfile(long memberId) {

        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new EntityNotFoundException());
        return member;
    }

    // 현재 로그인한 사용자 정보 조회
    public Member findMyProfile() {
        Member member = memberRepository.findById(1L)
                .orElseThrow(() -> new EntityNotFoundException());

        return member;
    }

    // 현재 로그인한 사용자 알람 -> 추후 작성

    // 프로필 이미지 업로드 -> 추후 작성

    // 마이 프로필 변경
    public Member updateMyProfile(Member member) {
        Member findMember = memberRepository.findById(member.getMemberId()).orElseThrow(() -> new EntityNotFoundException());
        Member updateMember = beanUtils.copyNonNullProperties(member, findMember);

        return memberRepository.save(updateMember);
    }

    // 회원 탈퇴
    public void deleteMember() {
        Member findMember = memberRepository.findById(1L).orElseThrow(() -> new EntityNotFoundException());
        memberRepository.delete(findMember);
    }

}
