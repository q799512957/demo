package com.activiti.demo.execution.mapper;

import com.activiti.demo.execution.entity.SDSCertificate;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SDSCertificateMapper {
    int insert(SDSCertificate sdsCertificate);

    int update(SDSCertificate sdsCertificate);

    List<Map<String,Object>> getList(String caseInfoId);
}