package com.activiti.demo.decision.service.impl;

import com.activiti.demo.decision.entity.SPDecision;
import com.activiti.demo.decision.mapper.SPDecisionMapper;
import com.activiti.demo.decision.service.SPDecisionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SPDecisionServiceImpl implements SPDecisionService {

    @Resource
    private SPDecisionMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SPDecision spDecision) {
        int r = mapper.update(spDecision);
        return r>0;
    }

    @Override
    public boolean insert(SPDecision spDecision) {
        spDecision.setPdlId(UUID.randomUUID().toString());
        int r = mapper.insert(spDecision);
        return r>0;
    }
}
