package com.jingdianjichi.subject.domain.converter;

import com.jingdianjichi.subject.domain.entity.SubjectAnswerBO;
import com.jingdianjichi.subject.domain.entity.SubjectInfoBO;
import com.jingdianjichi.subject.infra.basic.entity.SubjectBrief;
import com.jingdianjichi.subject.infra.basic.entity.SubjectJudge;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubjectBriefConverter {

    SubjectBriefConverter INSTANCE = Mappers.getMapper(SubjectBriefConverter.class);

    SubjectBrief converterBOToEntity(SubjectInfoBO subjectInfoBO);

}
