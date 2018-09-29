package com.activiti.demo.decision.service;

import com.activiti.demo.decision.entity.SHBulletin;

import java.util.List;
import java.util.Map;

public interface SHBulletinService {

    boolean insert(SHBulletin shBulletin);

    boolean update(SHBulletin shBulletin);

    List<Map<String,Object>> getList(String caseInfoId);


}
