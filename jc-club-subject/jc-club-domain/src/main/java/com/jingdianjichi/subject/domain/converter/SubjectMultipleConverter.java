package com.jingdianjichi.subject.domain.converter;

import com.jingdianjichi.subject.domain.entity.SubjectAnswerBO;
import com.jingdianjichi.subject.infra.basic.entity.SubjectJudge;
import com.jingdianjichi.subject.infra.basic.entity.SubjectMultiple;
import com.jingdianjichi.subject.infra.basic.entity.SubjectRadio;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectMultipleConverter {

    SubjectMultipleConverter INSTANCE = Mappers.getMapper(SubjectMultipleConverter.class);

    SubjectMultiple converterBOToEntity(SubjectAnswerBO subjectAnswerBO);

    List<SubjectAnswerBO> converterEntityToBoList(List<SubjectMultiple> subjectMultipleList);

}
