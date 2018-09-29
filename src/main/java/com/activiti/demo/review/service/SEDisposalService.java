package com.activiti.demo.review.service;

import com.activiti.demo.review.entity.SEDisposal;

import java.util.List;
import java.util.Map;

public interface SEDisposalService {

    boolean insert(SEDisposal seDisposal);

    boolean update(SEDisposal seDisposal);

    List<Map<String,Object>> getList(String caseInfoId);


}
