package com.activiti.demo.decision.service.impl;

import com.activiti.demo.decision.entity.SHRecord;
import com.activiti.demo.decision.mapper.SHRecordMapper;
import com.activiti.demo.decision.service.SHRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SHRecordServiceImpl implements SHRecordService {

    @Resource
    private SHRecordMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SHRecord shRecord) {
        int r = mapper.update(shRecord);
        return r>0;
    }

    @Override
    public boolean insert(SHRecord shRecord) {
        shRecord.setHrId(UUID.randomUUID().toString());
        int r = mapper.insert(shRecord);
        return r>0;
    }
}
