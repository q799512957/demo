package com.activiti.demo.filing.mapper;

import com.activiti.demo.filing.entity.SFMemorandum;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface SFMemorandumMapper {

    int insert(SFMemorandum sidPay);

    int update(SFMemorandum sidPay);

    List<Map<String,Object>> getList(String caseInfoId);
}