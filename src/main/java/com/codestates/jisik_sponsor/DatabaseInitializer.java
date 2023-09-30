package com.codestates.jisik_sponsor;

import com.codestates.jisik_sponsor.member.entity.Member;
import com.codestates.jisik_sponsor.member.repository.MemberRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseInitializer {

    @Bean
    public CommandLineRunner initDatabase(MemberRepository memberRepository) {
        return args -> {
            memberRepository.save(new Member("나태웅", "skqkstjr2@gmail.com", "010-3282-5783", "럭키가이"));
            memberRepository.save(new Member("나본향", "andehfdl@gmail.com", "010-2222-5784", "럭키가이동생"));
            memberRepository.save(new Member("나반석", "rocky@gmail.com", "010-2222-3333", "럭키가이사촌"));
//
//            Member findMember = memberRepository.findById(1L).orElseThrow(() -> new EntityNotFoundException());
//
//            projectRepository.save(new Project("마르코프 체인을 사용하여 러시아 올림픽 선수들의 약물 복용 여부 예측", findMember));
        };
    }
}
