package com.jingdianjichi.subject.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 题目标签表(SubjectLabeldto)
 *
 * @author makejava
 * @since 2024-06-06 13:57:16
 */
@Data
public class SubjectLabelBO implements Serializable {
    private static final long serialVersionUID = 792472395141449928L;
/**
     * 主键
     */
    private Long id;
    /**
     * 分类id
     */
    private Long categoryId;
/**
     * 标签分类
     */
    private String labelName;
/**
     * 排序
     */
    private Integer sortNum;

}

