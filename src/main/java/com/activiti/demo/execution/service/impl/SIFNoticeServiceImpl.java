package com.activiti.demo.execution.service.impl;

import com.activiti.demo.execution.entity.SIFNotice;
import com.activiti.demo.execution.mapper.SIFNoticeMapper;
import com.activiti.demo.execution.service.SIFNoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SIFNoticeServiceImpl implements SIFNoticeService {

    @Resource
    private SIFNoticeMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SIFNotice sifNotice) {
        int r = mapper.update(sifNotice);
        return r>0;
    }

    @Override
    public boolean insert(SIFNotice sifNotice) {
        sifNotice.setIfnId(UUID.randomUUID().toString());
        int r = mapper.insert(sifNotice);
        return r>0;
    }
}
