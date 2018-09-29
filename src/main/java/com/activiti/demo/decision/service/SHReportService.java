package com.activiti.demo.decision.service;

import com.activiti.demo.decision.entity.SHReport;

import java.util.List;
import java.util.Map;

public interface SHReportService {

    boolean insert(SHReport shReport);

    boolean update(SHReport shReport);

    List<Map<String,Object>> getList(String caseInfoId);


}
