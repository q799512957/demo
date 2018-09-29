package com.activiti.demo.review.mapper;

import com.activiti.demo.review.entity.SAApplication;
import org.mapstruct.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface SAApplicationMapper {

    int insert(SAApplication saApplication);

    int update(SAApplication saApplication);

    List<Map<String,Object>> getList(String caseInfoId);
}
