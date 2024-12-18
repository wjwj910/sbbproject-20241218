package com.mysite.sbb.controller;

import com.mysite.sbb.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "안녕하세요 sbb에 오신 것을 환영합니다.";
    }
/*
    // TABLE 조회
    @GetMapping("/questions")
    @ResponseBody
    public List<QuestionDto> getQuestions() {
        List<Question> questions = this.questionRepository.findAll();
        return questions.stream().map(Question::toDto).collect(Collectors.toList());
    }
*/


    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
