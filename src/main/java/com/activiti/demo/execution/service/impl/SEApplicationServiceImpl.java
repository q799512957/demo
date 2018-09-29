package com.activiti.demo.execution.service.impl;

import com.activiti.demo.execution.entity.SEApplication;
import com.activiti.demo.execution.mapper.SEApplicationMapper;
import com.activiti.demo.execution.service.SEApplicationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SEApplicationServiceImpl implements SEApplicationService {

    @Resource
    private SEApplicationMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SEApplication seApplication) {
        int r = mapper.update(seApplication);
        return r>0;
    }

    @Override
    public boolean insert(SEApplication seApplication) {
        seApplication.setEaId(UUID.randomUUID().toString());
        int r = mapper.insert(seApplication);
        return r>0;
    }
}
