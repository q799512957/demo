package com.activiti.demo.decision.mapper;

import com.activiti.demo.decision.entity.SHRecord;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface SHRecordMapper {
    int insert(SHRecord shRecord);

    int update(SHRecord shRecord);

    List<Map<String,Object>> getList(String caseInfoId);
}