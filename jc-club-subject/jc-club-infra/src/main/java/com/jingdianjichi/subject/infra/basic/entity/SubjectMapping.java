package com.jingdianjichi.subject.infra.basic.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 题目分类关系表(SubjectMapping)实体类
 *
 * @author makejava
 * @since 2024-06-06 13:55:09
 */

@Data
public class SubjectMapping implements Serializable {
    private static final long serialVersionUID = 206717994873673011L;
/**
     * 主键
     */
    private Long id;
/**
     * 题目id
     */
    private Long subjectId;
/**
     * 分类id
     */
    private Long categoryId;
/**
     * 标签id
     */
    private Long labelId;
/**
     * 创建人
     */
    private String createdBy;
/**
     * 创建时间
     */
    private Date createdTime;
/**
     * 修改人
     */
    private String updateBy;
/**
     * 修改时间
     */
    private Date updateTime;

    private Integer isDeleted;

}

