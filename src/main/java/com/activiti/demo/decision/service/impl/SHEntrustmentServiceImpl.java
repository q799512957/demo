package com.activiti.demo.decision.service.impl;

import com.activiti.demo.decision.entity.SHEntrustment;
import com.activiti.demo.decision.mapper.SHEntrustmentMapper;
import com.activiti.demo.decision.service.SHEntrustmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SHEntrustmentServiceImpl implements SHEntrustmentService {

    @Resource
    private SHEntrustmentMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SHEntrustment shEntrustment) {
        int r = mapper.update(shEntrustment);
        return r>0;
    }

    @Override
    public boolean insert(SHEntrustment shEntrustment) {
        shEntrustment.setHeId(UUID.randomUUID().toString());
        int r = mapper.insert(shEntrustment);
        return r>0;
    }
}
