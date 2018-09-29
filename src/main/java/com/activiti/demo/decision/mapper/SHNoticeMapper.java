package com.activiti.demo.decision.mapper;

import com.activiti.demo.decision.entity.SHNotice;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SHNoticeMapper {

    int insert(SHNotice shNotice);

    int update(SHNotice shNotice);

    List<Map<String,Object>> getList(String caseInfoId);
}