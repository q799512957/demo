package com.activiti.demo.review.service;

import com.activiti.demo.review.entity.SOCorrect;

import java.util.List;
import java.util.Map;

public interface SOCorrectService {

    boolean insert(SOCorrect soCorrect);

    boolean update(SOCorrect soCorrect);

    List<Map<String,Object>> getList(String caseInfoId);


}
