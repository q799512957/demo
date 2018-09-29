package com.activiti.demo.review.mapper;

import com.activiti.demo.review.entity.SOCorrect;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SOCorrectMapper {
    int insert(SOCorrect soCorrect);

    int update(SOCorrect soCorrect);

    List<Map<String,Object>> getList(String caseInfoId);
}