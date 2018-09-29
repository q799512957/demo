package com.activiti.demo.review.service;

import com.activiti.demo.review.entity.SSDefence;

import java.util.List;
import java.util.Map;

public interface SSDefenceService {

    boolean insert(SSDefence ssDefence);

    boolean update(SSDefence ssDefence);

    List<Map<String,Object>> getList(String caseInfoId);


}
