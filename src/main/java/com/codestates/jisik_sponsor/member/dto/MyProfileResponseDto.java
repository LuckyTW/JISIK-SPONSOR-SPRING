package com.codestates.jisik_sponsor.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class MyProfileResponseDto {

    private UserInfo userInfo;

    @Getter
    @AllArgsConstructor
    public static class UserInfo {

        private Long memberId;
        private String name;
        private String email;
        private String mobile;
        private String nickname;
        private String bio;
        private String profileUrl;
        private String signupMethod;
        private int projectsSupported;
        private BigDecimal totalAmount;
        private boolean emailVerified;

        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

    }
}
