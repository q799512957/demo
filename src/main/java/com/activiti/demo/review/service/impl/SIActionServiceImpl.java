package com.activiti.demo.review.service.impl;

import com.activiti.demo.review.service.SIActionService;
import com.activiti.demo.review.entity.SIAction;
import com.activiti.demo.review.mapper.SIActionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SIActionServiceImpl implements SIActionService {

    @Resource
    private SIActionMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SIAction siAction) {
        int r = mapper.update(siAction);
        return r>0;
    }

    @Override
    public boolean insert(SIAction siAction) {
        siAction.setIanId(UUID.randomUUID().toString());
        int r = mapper.insert(siAction);
        return r>0;
    }
}
