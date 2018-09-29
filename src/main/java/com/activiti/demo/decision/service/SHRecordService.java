package com.activiti.demo.decision.service;

import com.activiti.demo.decision.entity.SHRecord;

import java.util.List;
import java.util.Map;

public interface SHRecordService {

    boolean insert(SHRecord shBulletin);

    boolean update(SHRecord shBulletin);

    List<Map<String,Object>> getList(String caseInfoId);


}
