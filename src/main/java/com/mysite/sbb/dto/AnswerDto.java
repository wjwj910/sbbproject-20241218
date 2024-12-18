package com.mysite.sbb.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AnswerDto {
    private Integer id;
    private String content;
    private LocalDateTime createDate;
    private Integer questionId; // 질문 ID를 포함
}
