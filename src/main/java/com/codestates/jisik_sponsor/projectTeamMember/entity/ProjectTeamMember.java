package com.codestates.jisik_sponsor.projectTeamMember.entity;

import com.codestates.jisik_sponsor.project.entity.Project;
import com.codestates.jisik_sponsor.projectTeam.entity.ProjectTeam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ProjectTeamMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectTeamMemberId;

    @ManyToOne
    @JoinColumn(name = "PROJECT_ID")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "PROJECT_TEAM_ID")
    private ProjectTeam projectTeam;

    private String name;
    private String bio;

}
