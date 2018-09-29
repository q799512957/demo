package com.activiti.demo.decision.service;

import com.activiti.demo.decision.entity.SMCDiscussion;

import java.util.List;
import java.util.Map;

public interface SMCDiscussionService {

    boolean insert(SMCDiscussion smcDiscussion);

    boolean update(SMCDiscussion smcDiscussion);

    List<Map<String,Object>> getList(String caseInfoId);


}
