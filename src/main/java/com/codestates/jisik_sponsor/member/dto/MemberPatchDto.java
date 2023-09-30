package com.codestates.jisik_sponsor.member.dto;

import lombok.Getter;

@Getter
public class MemberPatchDto {
    private Long memberId;
    private String name;
    private String nickname;
    private String mobile;
    private String bio;
    private String password;
}
