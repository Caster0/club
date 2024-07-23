package com.jingdianjichi.subject.domain.converter;

import com.jingdianjichi.subject.domain.entity.SubjectInfoBO;
import com.jingdianjichi.subject.domain.entity.SubjectLabelBO;
import com.jingdianjichi.subject.domain.entity.SubjectOptionBO;
import com.jingdianjichi.subject.infra.basic.entity.SubjectInfo;
import com.jingdianjichi.subject.infra.basic.entity.SubjectLabel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectInfoConverter {

    SubjectInfoConverter INSTANCE = Mappers.getMapper(SubjectInfoConverter.class);

    SubjectInfo converterBOToInfo(SubjectInfoBO subjectInfoBO);

    SubjectInfoBO converterOptionAndInfoToBO(SubjectOptionBO subjectOptionBO,SubjectInfo subjectInfo);

    List<SubjectLabelBO> converterEntityToLabelBo(List<SubjectLabel> subjectLabel);
    List<SubjectInfoBO> converterListInfoToBo(List<SubjectInfo> subjectInfoList);
}
