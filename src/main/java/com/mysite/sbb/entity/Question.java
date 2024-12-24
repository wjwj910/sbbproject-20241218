package com.mysite.sbb.entity;

import com.mysite.sbb.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

    @ManyToOne
    private SiteUser author;
    /*
    // DTO로 변환하는 메서드
    public QuestionDto toDto() {
        QuestionDto dto = new QuestionDto();
        dto.setId(this.id);
        dto.setSubject(this.subject);
        dto.setContent(this.content);
        dto.setCreateDate(this.createDate);
        dto.setAnswerList(this.answerList.stream().map(Answer::toDto).toList());
        return dto;
    }
    */
}
