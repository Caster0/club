package com.jingdianjichi.subject.application.convert;

import com.jingdianjichi.subject.application.dto.SubjectAnswerDTO;
import com.jingdianjichi.subject.domain.entity.SubjectAnswerBO;
import com.jingdianjichi.subject.infra.basic.entity.SubjectInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectAnswerConverter {

    SubjectAnswerConverter INSTANCE = Mappers.getMapper(SubjectAnswerConverter.class);

    SubjectAnswerBO converterDTOToBO(SubjectAnswerDTO subjectAnswerDTO);

    List<SubjectAnswerBO> converterListDTOToBO(List<SubjectAnswerDTO> dtoList);


}
