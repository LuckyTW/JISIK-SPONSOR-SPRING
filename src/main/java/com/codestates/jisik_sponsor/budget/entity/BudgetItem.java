package com.codestates.jisik_sponsor.budget.entity;

import com.codestates.jisik_sponsor.project.entity.Project;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class BudgetItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long budgetItemId;

    @ManyToOne
    @JoinColumn(name = "PROJECT_ID")
    private Project project;

    private String title;

    @Column(precision = 12, scale = 2)
    private BigDecimal amount;
}
