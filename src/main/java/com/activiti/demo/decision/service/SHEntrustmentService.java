package com.activiti.demo.decision.service;

import com.activiti.demo.decision.entity.SHEntrustment;

import java.util.List;
import java.util.Map;

public interface SHEntrustmentService {

    boolean insert(SHEntrustment shEntrustment);

    boolean update(SHEntrustment shEntrustment);

    List<Map<String,Object>> getList(String caseInfoId);


}
