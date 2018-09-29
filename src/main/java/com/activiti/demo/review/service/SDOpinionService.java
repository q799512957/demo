package com.activiti.demo.review.service;

import com.activiti.demo.review.entity.SDOpinion;

import java.util.List;
import java.util.Map;

public interface SDOpinionService {

    boolean insert(SDOpinion sdOpinion);

    boolean update(SDOpinion sdOpinion);

    List<Map<String,Object>> getList(String caseInfoId);


}
