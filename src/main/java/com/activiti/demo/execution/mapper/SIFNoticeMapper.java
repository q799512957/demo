package com.activiti.demo.execution.mapper;

import com.activiti.demo.execution.entity.SIFNotice;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface SIFNoticeMapper {
    int insert(SIFNotice sifNotice);

    int update(SIFNotice sifNotice);

    List<Map<String,Object>> getList(String caseInfoId);
}