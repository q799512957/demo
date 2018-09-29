package com.activiti.demo.review.mapper;

import com.activiti.demo.review.entity.SIAction;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SIActionMapper {
    int insert(SIAction siAction);

    int update(SIAction siAction);

    List<Map<String,Object>> getList(String caseInfoId);
}