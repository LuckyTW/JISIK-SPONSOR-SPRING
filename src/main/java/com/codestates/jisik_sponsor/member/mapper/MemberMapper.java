package com.codestates.jisik_sponsor.member.mapper;


import com.codestates.jisik_sponsor.member.dto.MemberPatchDto;
import com.codestates.jisik_sponsor.member.dto.MemberProfileResponseDto;
import com.codestates.jisik_sponsor.member.dto.MyProfileResponseDto;
import com.codestates.jisik_sponsor.member.entity.Member;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface MemberMapper {

    // 멤버 프로필
    MemberProfileResponseDto.UserProfile memberToUserProfile(Member member);
    MemberProfileResponseDto userProfileToMemberProfileResponseDto(MemberProfileResponseDto.UserProfile userProfile);

    default MemberProfileResponseDto memberToMemberProfileResponseDto(Member member) {
        return userProfileToMemberProfileResponseDto(memberToUserProfile(member));
    }


    // 마이프로필
    MyProfileResponseDto.UserInfo memberToUserInfo(Member member);
    MyProfileResponseDto userInfoToMyProfileResponseDto(MyProfileResponseDto.UserInfo userInfo);

    default MyProfileResponseDto memberToMyProfileResponseDto(Member member) {
        return userInfoToMyProfileResponseDto(memberToUserInfo(member));
    }


    Member memberPatchDtoToMember(MemberPatchDto memberPatchDto);


}
