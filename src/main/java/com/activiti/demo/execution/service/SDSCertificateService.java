package com.activiti.demo.execution.service;

import com.activiti.demo.execution.entity.SDSCertificate;

import java.util.List;
import java.util.Map;

public interface SDSCertificateService {

    boolean insert(SDSCertificate sdsCertificate);

    boolean update(SDSCertificate sdsCertificate);

    List<Map<String,Object>> getList(String caseInfoId);


}
