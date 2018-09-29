package com.activiti.demo.decision.service.impl;

import com.activiti.demo.decision.entity.SHNotice;
import com.activiti.demo.decision.mapper.SHNoticeMapper;
import com.activiti.demo.decision.service.SHNoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SHNoticeServiceImpl implements SHNoticeService {

    @Resource
    private SHNoticeMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SHNotice shNotice) {
        int r = mapper.update(shNotice);
        return r>0;
    }

    @Override
    public boolean insert(SHNotice shNotice) {
        shNotice.setHnId(UUID.randomUUID().toString());
        int r = mapper.insert(shNotice);
        return r>0;
    }
}
