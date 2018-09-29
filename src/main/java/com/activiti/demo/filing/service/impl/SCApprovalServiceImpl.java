package com.activiti.demo.filing.service.impl;

import com.activiti.demo.filing.entity.SCApproval;
import com.activiti.demo.filing.mapper.SCApprovalMapper;
import com.activiti.demo.filing.service.SCApprovalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SCApprovalServiceImpl implements SCApprovalService {

    @Resource
    private SCApprovalMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SCApproval scApproval) {
        int r = mapper.update(scApproval);
        return r>0;
    }

    @Override
    public boolean insert(SCApproval scApproval) {
        scApproval.setId(UUID.randomUUID().toString());
        int r = mapper.insert(scApproval);
        return r>0;
    }
}
