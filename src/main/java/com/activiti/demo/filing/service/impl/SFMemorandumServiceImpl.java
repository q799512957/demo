package com.activiti.demo.filing.service.impl;

import com.activiti.demo.filing.entity.SFMemorandum;
import com.activiti.demo.filing.mapper.SFMemorandumMapper;
import com.activiti.demo.filing.service.SFMemorandumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SFMemorandumServiceImpl implements SFMemorandumService {

    @Resource
    private SFMemorandumMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SFMemorandum sfMemorandum) {
        int r = mapper.update(sfMemorandum);
        return r>0;
    }

    @Override
    public boolean insert(SFMemorandum sfMemorandum) {
        sfMemorandum.setFmId(UUID.randomUUID().toString());
        int r = mapper.insert(sfMemorandum);
        return r>0;
    }
}
