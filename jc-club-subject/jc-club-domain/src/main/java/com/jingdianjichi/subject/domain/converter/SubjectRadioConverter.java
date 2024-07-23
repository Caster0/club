package com.jingdianjichi.subject.domain.converter;

import com.jingdianjichi.subject.domain.entity.SubjectAnswerBO;
import com.jingdianjichi.subject.domain.entity.SubjectInfoBO;
import com.jingdianjichi.subject.domain.entity.SubjectLabelBO;
import com.jingdianjichi.subject.infra.basic.entity.SubjectInfo;
import com.jingdianjichi.subject.infra.basic.entity.SubjectJudge;
import com.jingdianjichi.subject.infra.basic.entity.SubjectLabel;
import com.jingdianjichi.subject.infra.basic.entity.SubjectRadio;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectRadioConverter {

    SubjectRadioConverter INSTANCE = Mappers.getMapper(SubjectRadioConverter.class);

    SubjectRadio converterBOToEntity(SubjectAnswerBO subjectAnswerBO);

    List<SubjectAnswerBO> converterEntityToBoList(List<SubjectRadio> subjectRadioList);
}
