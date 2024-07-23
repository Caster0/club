package com.jingdianjichi.subject.domain.service;

import com.jingdianjichi.subject.domain.entity.SubjectLabelBO;

import java.util.List;

public interface SubjectLabelDomainService {
    /**
     * 新增分类
     * @param subjectLabelBO
     */
    void add(SubjectLabelBO subjectLabelBO);

    /**
     * 查询岗位大类
     *
     * @param subjectLabelBO
     * @return
     */
    List<SubjectLabelBO> queryLabelByCategoryId(SubjectLabelBO subjectLabelBO);

    /**
     * 更新分类
     * @param subjectLabelBO
     * @return
     */
    Boolean update(SubjectLabelBO subjectLabelBO);

    /**
     * 删除分类
     * @param subjectLabelBO
     * @return
     */
    Boolean delete(SubjectLabelBO subjectLabelBO);

}
