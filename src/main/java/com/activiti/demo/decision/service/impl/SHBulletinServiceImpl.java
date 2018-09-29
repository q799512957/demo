package com.activiti.demo.decision.service.impl;

import com.activiti.demo.decision.entity.SHBulletin;
import com.activiti.demo.decision.mapper.SHBulletinMapper;
import com.activiti.demo.decision.service.SHBulletinService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SHBulletinServiceImpl implements SHBulletinService {

    @Resource
    private SHBulletinMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SHBulletin shBulletin) {
        int r = mapper.update(shBulletin);
        return r>0;
    }

    @Override
    public boolean insert(SHBulletin shBulletin) {
        shBulletin.setHbId(UUID.randomUUID().toString());
        int r = mapper.insert(shBulletin);
        return r>0;
    }
}
