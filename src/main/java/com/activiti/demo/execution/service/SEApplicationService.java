package com.activiti.demo.execution.service;

import com.activiti.demo.execution.entity.SEApplication;

import java.util.List;
import java.util.Map;

public interface SEApplicationService {

    boolean insert(SEApplication sifNotice);

    boolean update(SEApplication sifNotice);

    List<Map<String,Object>> getList(String caseInfoId);


}
