package com.activiti.demo.execution.service.impl;

import com.activiti.demo.execution.entity.SIDPay;
import com.activiti.demo.execution.mapper.SIDPayMapper;
import com.activiti.demo.execution.service.SIDPayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SIDPayServiceImpl implements SIDPayService {

    @Resource
    private SIDPayMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SIDPay sidPay) {
        int r = mapper.update(sidPay);
        return r>0;
    }

    @Override
    public boolean insert(SIDPay sidPay) {
        sidPay.setIdpaId(UUID.randomUUID().toString());
        int r = mapper.insert(sidPay);
        return r>0;
    }
}
