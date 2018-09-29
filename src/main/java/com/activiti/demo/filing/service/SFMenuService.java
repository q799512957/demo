package com.activiti.demo.filing.service;

import com.activiti.demo.filing.entity.SFMenu;

import java.util.List;
import java.util.Map;

public interface SFMenuService {

    boolean insert(SFMenu sfMenu);

    boolean update(SFMenu sfMenu);

    List<Map<String,Object>> getList(String caseInfoId);


}
