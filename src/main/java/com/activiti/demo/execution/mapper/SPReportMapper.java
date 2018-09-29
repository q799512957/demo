package com.activiti.demo.execution.mapper;

import com.activiti.demo.execution.entity.SPReport;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface SPReportMapper {
    int insert(SPReport spReport);

    int update(SPReport spReport);

    List<Map<String,Object>> getList(String caseInfoId);
}