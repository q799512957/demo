package com.activiti.demo.execution.mapper;

import com.activiti.demo.execution.entity.SEApplication;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface SEApplicationMapper {
    int insert(SEApplication seApplication);

    int update(SEApplication seApplication);

    List<Map<String,Object>> getList(String caseInfoId);
}