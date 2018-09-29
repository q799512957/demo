package com.activiti.demo.execution.service.impl;

import com.activiti.demo.execution.entity.SDSCertificate;
import com.activiti.demo.execution.mapper.SDSCertificateMapper;
import com.activiti.demo.execution.service.SDSCertificateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SDSCertificateServiceImpl implements SDSCertificateService {

    @Resource
    private SDSCertificateMapper mapper ;

    @Override
    public List<Map<String, Object>> getList(String caseInfoId) {
        return mapper.getList(caseInfoId);
    }

    @Override
    public boolean update(SDSCertificate sdsCertificate) {
        int r = mapper.update(sdsCertificate);
        return r>0;
    }

    @Override
    public boolean insert(SDSCertificate sdsCertificate) {
        sdsCertificate.setDscId(UUID.randomUUID().toString());
        int r = mapper.insert(sdsCertificate);
        return r>0;
    }
}
