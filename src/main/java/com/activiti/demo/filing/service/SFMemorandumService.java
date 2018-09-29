package com.activiti.demo.filing.service;

import com.activiti.demo.filing.entity.SFMemorandum;

import java.util.List;
import java.util.Map;

public interface SFMemorandumService {

    boolean insert(SFMemorandum sidPay);

    boolean update(SFMemorandum sidPay);

    List<Map<String,Object>> getList(String caseInfoId);


}
