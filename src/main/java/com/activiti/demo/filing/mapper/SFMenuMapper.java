package com.activiti.demo.filing.mapper;

import com.activiti.demo.filing.entity.SFMenu;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface SFMenuMapper {

    int insert(SFMenu sfMenu);

    int update(SFMenu sfMenu);

    List<Map<String,Object>> getList(String caseInfoId);
}