package com.activiti.demo.execution.service;

import com.activiti.demo.execution.entity.SIFNotice;

import java.util.List;
import java.util.Map;

public interface SIFNoticeService {

    boolean insert(SIFNotice sifNotice);

    boolean update(SIFNotice sifNotice);

    List<Map<String,Object>> getList(String caseInfoId);


}
