package com.mysite.sbb.entity;

import com.mysite.sbb.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;

    @ManyToOne
    private SiteUser author;
    /*
    // DTO로 변환하는 메서드
    public AnswerDto toDto() {
        AnswerDto dto = new AnswerDto();
        dto.setId(this.id);
        dto.setContent(this.content);
        dto.setCreateDate(this.createDate);
        dto.setQuestionId(this.question.getId());
        return dto;
    }
    */
}
