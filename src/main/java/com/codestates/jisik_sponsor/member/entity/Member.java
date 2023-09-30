package com.codestates.jisik_sponsor.member.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter @Setter
@NoArgsConstructor
public class Member {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long memberId;

        @Enumerated(EnumType.STRING)
        private UserRole userRole = UserRole.USER;

        @Column(nullable = false, unique = true, length = 50)
        private String name;

        @Column(nullable = false, unique = true, length = 128)
        private String email;

        @Column(nullable = false, unique = true, length = 50)
        private String mobile;

        @Column(unique = true, length = 50)
        private String nickname;

        @Column(nullable = false)
        private String password;

        @Lob
        @Column(columnDefinition = "text")
        private String bio;

        private String profileUrl;

        @Column(nullable = false)
        private String signupMethod;

        @Column(nullable = false)
        private boolean emailVerified;

        @Column(nullable = false)
        private String keyForVerify;

        @Column(nullable = false)
        private int projectsSupported;

        @Column(precision = 12, scale = 2)
        private BigDecimal totalAmount;

        @Column(nullable = false)
        private LocalDateTime createdAt = LocalDateTime.now();

        @Column(nullable = false)
        private LocalDateTime updatedAt = LocalDateTime.now();

        public Member(String name, String email, String mobile, String nickname) {
                this.name = name;
                this.email = email;
                this.mobile = mobile;
                this.nickname = nickname;
                this.password = "lucky";
                this.bio = "안녕하세요 연구자 나태웅입니다.";
                this.profileUrl = "/lucky";
                this.signupMethod = "일반";
                this.emailVerified = true;
                this.keyForVerify = "가나다라";
                this.projectsSupported = 2;
                this.totalAmount = BigDecimal.valueOf(100000);
        }

        public enum UserRole {
                ADMIN(1, "관리자"),
                ADMIN_DEMO(2, "관리자 데모"),
                USER(3, "일반회원");

                @Getter
                private int roleId;

                @Getter
                private String description;


                UserRole(int roleId, String description) {
                        this.roleId = roleId;
                        this.description = description;
                }
        }

}
