package com.activiti.demo.review.service.impl;

import com.activiti.demo.review.service.SEDisposalService;
import com.activiti.demo.review.entity.SEDisposal;
import com.activiti.demo.review.mapper.SEDisposalMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SEDisposalServiceImpl implements SEDisposalService {

    @Resource
    private SEDisposalMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SEDisposal seDisposal) {
        int r = mapper.update(seDisposal);
        return r>0;
    }

    @Override
    public boolean insert(SEDisposal seDisposal) {
        seDisposal.setEddId(UUID.randomUUID().toString());
        int r = mapper.insert(seDisposal);
        return r>0;
    }
}
