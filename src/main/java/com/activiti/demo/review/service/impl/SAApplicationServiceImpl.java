package com.activiti.demo.review.service.impl;

import com.activiti.demo.review.service.SAApplicationService;
import com.activiti.demo.review.entity.SAApplication;
import com.activiti.demo.review.mapper.SAApplicationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SAApplicationServiceImpl implements SAApplicationService {

    @Resource
    private SAApplicationMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SAApplication saApplications) {
        int r = mapper.update(saApplications);
        return r>0;
    }

    @Override
    public boolean insert(SAApplication saApplication) {
        saApplication.setAaId(UUID.randomUUID().toString());
        int r = mapper.insert(saApplication);
        return r>0;
    }
}
