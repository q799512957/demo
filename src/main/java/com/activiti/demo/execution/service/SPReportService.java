package com.activiti.demo.execution.service;

import com.activiti.demo.execution.entity.SPReport;

import java.util.List;
import java.util.Map;

public interface SPReportService {

    boolean insert(SPReport spReport);

    boolean update(SPReport spReport);

    List<Map<String,Object>> getList(String caseInfoId);


}
