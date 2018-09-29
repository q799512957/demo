package com.activiti.demo.review.service.impl;

import com.activiti.demo.review.service.SSDefenceService;
import com.activiti.demo.review.entity.SSDefence;
import com.activiti.demo.review.mapper.SSDefenceMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SSDefenceServiceImpl implements SSDefenceService {

    @Resource
    private SSDefenceMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SSDefence ssDefence) {
        int r = mapper.update(ssDefence);
        return r>0;
    }

    @Override
    public boolean insert(SSDefence ssDefence) {
        ssDefence.setSadId(UUID.randomUUID().toString());
        int r = mapper.insert(ssDefence);
        return r>0;
    }
}
