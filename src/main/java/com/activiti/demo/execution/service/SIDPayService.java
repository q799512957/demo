package com.activiti.demo.execution.service;

import com.activiti.demo.execution.entity.SIDPay;

import java.util.List;
import java.util.Map;

public interface SIDPayService {

    boolean insert(SIDPay sidPay);

    boolean update(SIDPay sidPay);

    List<Map<String,Object>> getList(String caseInfoId);


}
