package com.codestates.jisik_sponsor.member.controller;

import com.codestates.jisik_sponsor.member.dto.MemberPatchDto;
import com.codestates.jisik_sponsor.member.dto.MemberProfileResponseDto;
import com.codestates.jisik_sponsor.member.dto.MyProfileResponseDto;
import com.codestates.jisik_sponsor.member.entity.Member;
import com.codestates.jisik_sponsor.member.mapper.MemberMapper;
import com.codestates.jisik_sponsor.member.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;
    private final MemberMapper mapper;

    public MemberController(MemberService memberService, MemberMapper mapper) {
        this.memberService = memberService;
        this.mapper = mapper;
    }

    // 사용자 공개 프로필 조회
    @GetMapping("/{memberId}")
    public ResponseEntity getMemberProfile(@PathVariable("memberId") long memberId) {

        Member findMember = memberService.findMemberProfile(memberId);
        MemberProfileResponseDto memberProfileResponseDto = mapper.memberToMemberProfileResponseDto(findMember);

        return new ResponseEntity<>(memberProfileResponseDto, HttpStatus.OK);
    }

    // 마이프로필 정보 조회
    @GetMapping("/me")
    public ResponseEntity getMyProfile() {
        Member myProfile = memberService.findMyProfile();
        MyProfileResponseDto memberProfileResponseDto = mapper.memberToMyProfileResponseDto(myProfile);

        return new ResponseEntity<>(memberProfileResponseDto, HttpStatus.OK);
    }

    // 현재 로그인한 사용자 알람 -> 추후 작성

    // 프로필 이미지 업로드 -> 추후 작성

    // 마이 프로필 변경
    @PatchMapping("/me")
    public ResponseEntity patchMyProfile(@RequestBody MemberPatchDto memberPatchDto) {

        Member updateMember = memberService.updateMyProfile(mapper.memberPatchDtoToMember(memberPatchDto));
        MyProfileResponseDto myProfileResponseDto = mapper.memberToMyProfileResponseDto(updateMember);

        return new ResponseEntity<>(myProfileResponseDto, HttpStatus.OK);
    }

    // 회원 탈퇴
    @DeleteMapping("/me")
    public ResponseEntity deleteMember() {

        memberService.deleteMember();

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}