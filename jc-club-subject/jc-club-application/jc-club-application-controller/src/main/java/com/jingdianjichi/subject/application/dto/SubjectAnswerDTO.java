package com.jingdianjichi.subject.application.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 题目答案DTO
 *
 * @author makejava
 * @since 2024-06-06 17:23:16
 */
@Data
public class SubjectAnswerDTO implements Serializable {
    /**
     * 答案选项标识
     */
    private Integer optionType;
    /**
     * 答案
     */
    private String optionContent;
    /**
     * 是否正确
     */
    private Integer isCorrect;

}

