package com.activiti.demo.decision.service;

import com.activiti.demo.decision.entity.SHNotice;

import java.util.List;
import java.util.Map;

public interface SHNoticeService {

    boolean insert(SHNotice ssDefence);

    boolean update(SHNotice ssDefence);

    List<Map<String,Object>> getList(String caseInfoId);


}
