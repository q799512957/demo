package com.activiti.demo.decision.mapper;

import com.activiti.demo.decision.entity.SMCDiscussion;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SMCDiscussionMapper {

    int insert(SMCDiscussion smcDiscussion);

    int update(SMCDiscussion smcDiscussion);

    List<Map<String,Object>> getList(String caseInfoId);
}