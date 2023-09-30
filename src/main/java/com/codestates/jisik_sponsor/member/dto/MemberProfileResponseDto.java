package com.codestates.jisik_sponsor.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class MemberProfileResponseDto {

    private UserProfile userProfile;

    @Getter
    @AllArgsConstructor
    public static class UserProfile {

        private Long memberId;
        private String name;
        private String nickname;
        private String bio;
        private String profileUrl;
        private LocalDateTime createdAt;
    }
}
