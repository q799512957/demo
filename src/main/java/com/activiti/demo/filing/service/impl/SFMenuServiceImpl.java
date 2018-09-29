package com.activiti.demo.filing.service.impl;

import com.activiti.demo.filing.entity.SFMenu;
import com.activiti.demo.filing.mapper.SFMenuMapper;
import com.activiti.demo.filing.service.SFMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SFMenuServiceImpl implements SFMenuService {

    @Resource
    private SFMenuMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SFMenu sfMenu) {
        int r = mapper.update(sfMenu);
        return r>0;
    }

    @Override
    public boolean insert(SFMenu sfMenu) {
        sfMenu.setFmId(UUID.randomUUID().toString());
        int r = mapper.insert(sfMenu);
        return r>0;
    }
}
