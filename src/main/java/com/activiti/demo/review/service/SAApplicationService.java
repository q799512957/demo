package com.activiti.demo.review.service;

import com.activiti.demo.review.entity.SAApplication;

import java.util.List;
import java.util.Map;

public interface SAApplicationService {

    boolean insert(SAApplication saApplication);

    boolean update(SAApplication saApplication);

    List<Map<String,Object>> getList(String caseInfoId);


}
