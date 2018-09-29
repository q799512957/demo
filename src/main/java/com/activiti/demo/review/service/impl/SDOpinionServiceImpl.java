package com.activiti.demo.review.service.impl;

import com.activiti.demo.review.service.SDOpinionService;
import com.activiti.demo.review.entity.SDOpinion;
import com.activiti.demo.review.mapper.SDOpinionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SDOpinionServiceImpl implements SDOpinionService {

    @Resource
    private SDOpinionMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SDOpinion sdOpinion) {
        int r = mapper.update(sdOpinion);
        return r>0;
    }

    @Override
    public boolean insert(SDOpinion sdOpinion) {
        sdOpinion.setCdoId(UUID.randomUUID().toString());
        int r = mapper.insert(sdOpinion);
        return r>0;
    }
}
