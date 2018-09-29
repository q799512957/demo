package com.activiti.demo.decision.mapper;

import com.activiti.demo.decision.entity.SPDecision;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface SPDecisionMapper {
    int insert(SPDecision spDecision);

    int update(SPDecision spDecision);

    List<Map<String,Object>> getList(String caseInfoId);
}