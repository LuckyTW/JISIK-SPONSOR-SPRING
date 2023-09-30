package com.codestates.jisik_sponsor.order.entity;

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
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "PROJECT_ID")
    private Project project;

    private String merchantUid;
    private String name;
    private BigDecimal amount;
    private String buyerName;
    private String buyerTel;
    private String buyerEmail;
    private String buyerAddress;
    private String buyerPostcode;
    private boolean success;
    private String status;
    private String impUid;
    private String pgProvider;
    private String pgTid;
    private String payMethod;
    private int paidAmount;
    private int paidAt;
    private String receiptUrl;
    private String cardName;
    private String applyNum;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime updatedAt = LocalDateTime.now();

}
