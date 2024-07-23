package com.jingdianjichi.subject.application.convert;

import com.jingdianjichi.subject.application.dto.SubjectAnswerDTO;
import com.jingdianjichi.subject.domain.entity.SubjectAnswerBO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-23T10:52:16+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_371 (Oracle Corporation)"
)
public class SubjectAnswerConverterImpl implements SubjectAnswerConverter {

    @Override
    public SubjectAnswerBO converterDTOToBO(SubjectAnswerDTO subjectAnswerDTO) {
        if ( subjectAnswerDTO == null ) {
            return null;
        }

        SubjectAnswerBO subjectAnswerBO = new SubjectAnswerBO();

        subjectAnswerBO.setOptionType( subjectAnswerDTO.getOptionType() );
        subjectAnswerBO.setOptionContent( subjectAnswerDTO.getOptionContent() );
        subjectAnswerBO.setIsCorrect( subjectAnswerDTO.getIsCorrect() );

        return subjectAnswerBO;
    }

    @Override
    public List<SubjectAnswerBO> converterListDTOToBO(List<SubjectAnswerDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SubjectAnswerBO> list = new ArrayList<SubjectAnswerBO>( dtoList.size() );
        for ( SubjectAnswerDTO subjectAnswerDTO : dtoList ) {
            list.add( converterDTOToBO( subjectAnswerDTO ) );
        }

        return list;
    }
}
