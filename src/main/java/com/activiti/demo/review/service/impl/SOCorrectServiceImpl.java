package com.activiti.demo.review.service.impl;

import com.activiti.demo.review.service.SOCorrectService;
import com.activiti.demo.review.entity.SOCorrect;
import com.activiti.demo.review.mapper.SOCorrectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SOCorrectServiceImpl implements SOCorrectService {

    @Resource
    private SOCorrectMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SOCorrect soCorrect) {
        int r = mapper.update(soCorrect);
        return r>0;
    }

    @Override
    public boolean insert(SOCorrect soCorrect) {
        soCorrect.setOcnId(UUID.randomUUID().toString());
        int r = mapper.insert(soCorrect);
        return r>0;
    }
}
