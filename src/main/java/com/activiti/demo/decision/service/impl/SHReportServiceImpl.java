package com.activiti.demo.decision.service.impl;

import com.activiti.demo.decision.entity.SHReport;
import com.activiti.demo.decision.mapper.SHReportMapper;
import com.activiti.demo.decision.service.SHReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SHReportServiceImpl implements SHReportService {

    @Resource
    private SHReportMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SHReport shReport) {
        int r = mapper.update(shReport);
        return r>0;
    }

    @Override
    public boolean insert(SHReport shReport) {
        shReport.setHrId(UUID.randomUUID().toString());
        int r = mapper.insert(shReport);
        return r>0;
    }
}
