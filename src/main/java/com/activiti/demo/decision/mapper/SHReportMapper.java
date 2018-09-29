package com.activiti.demo.decision.mapper;

import com.activiti.demo.decision.entity.SHReport;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface SHReportMapper {
    int insert(SHReport shReport);

    int update(SHReport shReport);

    List<Map<String,Object>> getList(String caseInfoId);
}