package com.jingdianjichi.subject.domain.entity;

import com.jingdianjichi.subject.common.entity.PageInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 题目DTO
 *
 * @author makejava
 * @since 2024-06-06 17:23:16
 */
@Data
public class SubjectOptionBO extends PageInfo implements Serializable {
    private static final long serialVersionUID = 674809820475871288L;

/**
 * 题目答案
 */
    private String subjectAnswer;

    /**
     * 答案选项
     */
    private List<SubjectAnswerBO> optionList;

}

