package com.activiti.demo.execution.service.impl;

import com.activiti.demo.execution.entity.SPReport;
import com.activiti.demo.execution.mapper.SPReportMapper;
import com.activiti.demo.execution.service.SPReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SPReportServiceImpl implements SPReportService {

    @Resource
    private SPReportMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SPReport spReport) {
        int r = mapper.update(spReport);
        return r>0;
    }

    @Override
    public boolean insert(SPReport spReport) {
        spReport.setPrId(UUID.randomUUID().toString());
        int r = mapper.insert(spReport);
        return r>0;
    }
}
