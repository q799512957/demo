package com.activiti.demo.decision.service.impl;

import com.activiti.demo.decision.entity.SMCDiscussion;
import com.activiti.demo.decision.mapper.SMCDiscussionMapper;
import com.activiti.demo.decision.service.SMCDiscussionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SMCDiscussionServiceImpl implements SMCDiscussionService {

    @Resource
    private SMCDiscussionMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SMCDiscussion smcDiscussion) {
        int r = mapper.update(smcDiscussion);
        return r>0;
    }

    @Override
    public boolean insert(SMCDiscussion smcDiscussion) {
        smcDiscussion.setMcdId(UUID.randomUUID().toString());
        int r = mapper.insert(smcDiscussion);
        return r>0;
    }
}
