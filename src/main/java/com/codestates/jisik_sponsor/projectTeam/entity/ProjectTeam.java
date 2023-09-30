package com.codestates.jisik_sponsor.projectTeam.entity;

import com.codestates.jisik_sponsor.member.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ProjectTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectTeamId;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    private String teamName;

    @Lob
    @Column(columnDefinition = "text")
    private String teamDescription;

    private String profileUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
