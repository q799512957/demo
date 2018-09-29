package com.activiti.demo.execution.mapper;

import com.activiti.demo.execution.entity.SIDPay;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface SIDPayMapper {
    int insert(SIDPay sidPay);

    int update(SIDPay sidPay);

    List<Map<String,Object>> getList(String caseInfoId);
}