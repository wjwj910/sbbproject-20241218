package com.mysite.sbb.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class QuestionDto {
    private Integer id;
    private String subject;
    private String content;
    private LocalDateTime createDate;
    private List<AnswerDto> answerList; // 답변 리스트를 포함
}
