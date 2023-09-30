package com.codestates.jisik_sponsor.sponsor.entity;


import com.codestates.jisik_sponsor.member.entity.Member;
import com.codestates.jisik_sponsor.project.entity.Project;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ProjectSponsor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectSponsorId;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "PROJECT_ID")
    private Project project;

    @Column(precision = 12, scale = 2)
    private BigDecimal pledged;

    private String status;

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
}
