package com.activiti.demo.decision.mapper;

import com.activiti.demo.decision.entity.SHEntrustment;

import java.util.List;
import java.util.Map;

public interface SHEntrustmentMapper {
    int insert(SHEntrustment shEntrustment);

    int update(SHEntrustment shEntrustment);

    List<Map<String,Object>> getList(String caseInfoId);
}