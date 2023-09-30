package com.codestates.jisik_sponsor.project.entity;


import com.codestates.jisik_sponsor.member.entity.Member;
import com.codestates.jisik_sponsor.projectTeam.entity.ProjectTeam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.beans.ConstructorProperties;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;

    private String title;
    private String path;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "PROJECT_TEAM_ID")
    private ProjectTeam projectTeam;

    @Lob
    private String term;

    private LocalDateTime startDate = LocalDateTime.now() ;
    private LocalDateTime endDate = LocalDateTime.now();
    private String status;

    @Column(precision = 12, scale = 2)
    private BigDecimal goal;

    @Column(precision = 12, scale = 2)
    private BigDecimal pledged;

    @Column(precision = 12, scale = 2)
    private BigDecimal remainder;

    private int sponsors;

    private int comments;
    private int wishes;
    private int views;

    @Lob
    @Column(columnDefinition = "longtext")
    private String projectBackground;

    @Lob
    @Column(columnDefinition = "longtext")
    private String projectProgress;

    @Lob
    @Column(columnDefinition = "longtext")
    private String projectGoals;

    @Lob
    @Column(columnDefinition = "longtext")
    private String budgetSynopsis;

    @Lob
    @Column(columnDefinition = "longtext")
    private String milestoneDescription;

    @Lob
    @Column(columnDefinition = "text")
    private String researcherWord;

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

    public Project(String title, Member member) {
        this.title = title;
        this.path = "/projects/lucky";
        this.member = member;
        this.projectTeam = new ProjectTeam();
        this.status = "inprogress";
        this.goal = BigDecimal.valueOf(100000);
        this.pledged = BigDecimal.valueOf(30000);
        this.remainder = BigDecimal.valueOf(70000);
        this.sponsors = 3;
        this.comments = 10;
        this.wishes = 5;
        this.views = 1000;
        this.projectBackground = "도핑은 잠재적으로 선수들의 건강에 해롭거나 경기력을 향상시킬 수 있는 편법을 사용하는 것입니다. 도핑 방지 규칙 위반은 러시아 선수들이 약물 복용을 할 가능성이 가장 높다는 것을 나타냅니다. CAS의 경우, 러시아 정부에 의한 조직적인 도핑은 2014년 소치 올림픽과 2016년 리우 올림픽에서 일어났습니다. 러시아 정부는 정보를 범죄에 오용하고 있기 때문에 IOC는 2018년 평창에서 도핑 방지 시스템의 체계적 조작을 통해 러시아 선수들을 철저히 단속하였습니다.";
        this.projectProgress = "WADA는 존재를 근거로 도핑이 합리적인 의심을 넘어서는 범죄로 보고 있지만, 선수들은 도핑이 실제로 했다는 것을 입증해야 한다는 것에 대해서는 부담감을 가지고 있습니다. IOC는 소치 올림픽에서 수십 명의 러시아 선수들을 도핑 금지 규정을 위반한 혐의로 제재하기로 결정했습니다. 하지만, 러시아의 비탈리 무트코 부총리는 국가가 후원하는 도핑에 대해 올림픽 출전 금지에 대해 국제사회에 호소할 생각입니다. 내부 고발자인 율리야 스테파노바와 발견되지 않은 물질의 발명가인 그레고리 로드첸코프는 이 스캔들을 폭로하기 위해 미국으로 도피했습니다. 저희는 이번 프로젝트를 통해 러시아 운동선수들과 협력자들이 조직적인 도핑에 반대할 뿐만 아니라 저항할 수 있도록 도울 수 예정입니다.";
        this.projectGoals = "저희의 가설은 러시아의 도핑에 대한 국가의 후원은 랜덤워크라는 것입니다. RUSADA의 조직적 도핑 사례는 IOC의 검열을 매번 교묘히 벗어나고 있습니다. 따라서 이는 러시아 선수들의 체계적 도핑의 가능성을 증가시킵니다. 하지만, 러시아와 다른 나라들; 혈액이나 소변 조작에 대한 도핑의 거대한 사례들 사이에서 개연성은 계산될 수 있습니다. 생물학적 여권과 행방 추적에 기초하여 감지된 선수들의 데이터를 수집하여, 마르코프 체인을 통하여 다가오는 올림픽에서 도핑 확률을 계산할 것 입니다. 계산을 통해 얻은 저희의 연구결과는 트위터, Facebook 등 SNS 그리고 스포츠 법 저널에 게재될 예정입니다.";
        this.budgetSynopsis = "이번 기획된 프로젝트의 총 기간은 한 달로 예상하고 있고, 총 예산은 1000달러입니다. Google Scholar와 Westlaw 또는 HeinOnline는 2022년 2월까지 무료로 이용할 수 있기 때문에 데이터 수집에는 비용이 소요되지 않을 것이라 예상합니다. 하지만 저희 연구진들은 현재 경제활동에 종사하지 않고 있고, 기존에 하던 파트타임도 2022년 말 예정된 스케줄로 인하여 그만 둔 상태입니다. 따라서 모금된 연구기금은 저희 연구팀원들의 식비, 교통비 등의 생활비로 지출될 예정입니다. 현재 책정된 예산은 이번 연구를 진행하기에 충분하다고 사료됩니다.";
        this.milestoneDescription = "저희가 기획한 연구기간은 한 달(2022년 1월)입니다. 먼저 2022년 1월 5일에 '지식스폰서'를 통한 연구를 시작할 것 입니다.  그 후 1월 12일 부터는 러시아 선수 도핑에 관련된 사례 및 데이터 수집을 진행할 예정입니다.  1월 24일 부터는 수집된 데이터와 마르코프 체인을 통하여 경과 확률 계산을 진행할 것 입니다. 마지막으로 ECHR 및 ECJ 요약본을 1월 31일까지 작성할 생각입니다.";
        this.researcherWord = "저희의 가설은 러시아의 도핑에 대한 국가의 후원은 랜덤워크라는 것입니다. 정확한 사실을 알고 싶습니다. 많은 관심 부탁드립니다.";
    }

    @Getter
    @RequiredArgsConstructor
    public enum Category {
        HUMANITY("인문학"),
        SOCIAL_SCIENCE("사회과학"),
        NATURAL_SCIENCE("자연과학"),
        ENGINEERING("공학"),
        MEDICINE("의약학"),
        AGRICULTURAL_MARINE_SCIENCE("농수해양학"),
        ARTS_PHYSICAL_EDUCATION("예술체육학"),
        COMPOSITE("복합학");

        private final String name;
    }
}
