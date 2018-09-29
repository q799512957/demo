package com.activiti.demo.review.mapper;

import com.activiti.demo.review.entity.SSDefence;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface SSDefenceMapper {
    int insert(SSDefence ssDefence);

    int update(SSDefence ssDefence);

    List<Map<String,Object>> getList(String caseInfoId);
}