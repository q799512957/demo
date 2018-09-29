package com.activiti.demo.review.service;

import com.activiti.demo.review.entity.SIAction;

import java.util.List;
import java.util.Map;

public interface SIActionService {

    boolean insert(SIAction siAction);

    boolean update(SIAction siAction);

    List<Map<String,Object>> getList(String caseInfoId);


}
