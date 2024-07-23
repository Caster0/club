package com.jingdianjichi.subject.domain.converter;

import com.jingdianjichi.subject.domain.entity.SubjectAnswerBO;
import com.jingdianjichi.subject.infra.basic.entity.SubjectJudge;
import com.jingdianjichi.subject.infra.basic.entity.SubjectMultiple;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectJudgeConverter {

    SubjectJudgeConverter INSTANCE = Mappers.getMapper(SubjectJudgeConverter.class);

    SubjectJudge converterBOToEntity(SubjectAnswerBO subjectAnswerBO);

    List<SubjectAnswerBO> converterEntityToBoList(List<SubjectJudge> subjectJudgeList);

}
