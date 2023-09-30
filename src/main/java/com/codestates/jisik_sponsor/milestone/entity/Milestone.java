package com.codestates.jisik_sponsor.milestone.entity;

import com.codestates.jisik_sponsor.project.entity.Project;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Milestone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long milestoneID;

    @ManyToOne
    @JoinColumn(name = "PROJECT_ID")
    private Project project;

    private String title;
    private LocalDateTime goalDate;
}
