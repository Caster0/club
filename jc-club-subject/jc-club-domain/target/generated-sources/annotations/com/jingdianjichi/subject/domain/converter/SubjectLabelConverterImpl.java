package com.jingdianjichi.subject.domain.converter;

import com.jingdianjichi.subject.domain.entity.SubjectLabelBO;
import com.jingdianjichi.subject.infra.basic.entity.SubjectLabel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-23T10:52:15+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_371 (Oracle Corporation)"
)
public class SubjectLabelConverterImpl implements SubjectLabelConverter {

    @Override
    public SubjectLabel converterBOToLabel(SubjectLabelBO subjectLabelBO) {
        if ( subjectLabelBO == null ) {
            return null;
        }

        SubjectLabel subjectLabel = new SubjectLabel();

        subjectLabel.setId( subjectLabelBO.getId() );
        subjectLabel.setLabelName( subjectLabelBO.getLabelName() );
        subjectLabel.setSortNum( subjectLabelBO.getSortNum() );
        subjectLabel.setCategoryId( subjectLabelBO.getCategoryId() );

        return subjectLabel;
    }

    @Override
    public List<SubjectLabelBO> converterEntityToLabelBo(List<SubjectLabel> subjectLabel) {
        if ( subjectLabel == null ) {
            return null;
        }

        List<SubjectLabelBO> list = new ArrayList<SubjectLabelBO>( subjectLabel.size() );
        for ( SubjectLabel subjectLabel1 : subjectLabel ) {
            list.add( subjectLabelToSubjectLabelBO( subjectLabel1 ) );
        }

        return list;
    }

    protected SubjectLabelBO subjectLabelToSubjectLabelBO(SubjectLabel subjectLabel) {
        if ( subjectLabel == null ) {
            return null;
        }

        SubjectLabelBO subjectLabelBO = new SubjectLabelBO();

        subjectLabelBO.setId( subjectLabel.getId() );
        subjectLabelBO.setCategoryId( subjectLabel.getCategoryId() );
        subjectLabelBO.setLabelName( subjectLabel.getLabelName() );
        subjectLabelBO.setSortNum( subjectLabel.getSortNum() );

        return subjectLabelBO;
    }
}
