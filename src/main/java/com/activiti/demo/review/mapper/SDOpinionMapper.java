package com.activiti.demo.review.mapper;

import com.activiti.demo.review.entity.SDOpinion;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SDOpinionMapper {
    int insert(SDOpinion sdOpinion);

    int update(SDOpinion sdOpinion);

    List<Map<String,Object>> getList(String caseInfoId);
}