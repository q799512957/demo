package com.activiti.demo.decision.mapper;

import com.activiti.demo.decision.entity.SHBulletin;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SHBulletinMapper {

    int insert(SHBulletin shBulletin);

    int update(SHBulletin shBulletin);

    List<Map<String,Object>> getList(String caseInfoId);
}