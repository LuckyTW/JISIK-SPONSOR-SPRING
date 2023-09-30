package com.codestates.jisik_sponsor.member.mapper;

import com.codestates.jisik_sponsor.member.dto.MemberProfileDto;
import com.codestates.jisik_sponsor.member.dto.MyProfileDto;
import com.codestates.jisik_sponsor.member.entity.Member;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-29T11:40:47+0900",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public MemberProfileDto memberToMemberProfileDto(Member member) {
        if ( member == null ) {
            return null;
        }

        Long memberId = null;
        String name = null;
        String nickname = null;
        String bio = null;
        String profileUrl = null;
        LocalDateTime createdAt = null;

        memberId = member.getMemberId();
        name = member.getName();
        nickname = member.getNickname();
        bio = member.getBio();
        profileUrl = member.getProfileUrl();
        createdAt = member.getCreatedAt();

        MemberProfileDto memberProfileDto = new MemberProfileDto( memberId, name, nickname, bio, profileUrl, createdAt );

        return memberProfileDto;
    }

    @Override
    public MyProfileDto memberToMyProfileDto(Member member) {
        if ( member == null ) {
            return null;
        }

        MyProfileDto myProfileDto = new MyProfileDto();

        myProfileDto.setMemberId( member.getMemberId() );
        myProfileDto.setName( member.getName() );
        myProfileDto.setEmail( member.getEmail() );
        myProfileDto.setMobile( member.getMobile() );
        myProfileDto.setNickname( member.getNickname() );
        myProfileDto.setBio( member.getBio() );
        myProfileDto.setProfileUrl( member.getProfileUrl() );
        myProfileDto.setSignupMethod( member.getSignupMethod() );
        myProfileDto.setProjectsSupported( member.getProjectsSupported() );
        myProfileDto.setTotalAmount( member.getTotalAmount() );
        myProfileDto.setEmailVerified( member.isEmailVerified() );
        myProfileDto.setCreatedAt( member.getCreatedAt() );
        myProfileDto.setUpdatedAt( member.getUpdatedAt() );

        return myProfileDto;
    }
}
