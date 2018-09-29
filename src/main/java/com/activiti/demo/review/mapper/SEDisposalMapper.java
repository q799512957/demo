package com.activiti.demo.review.mapper;

import com.activiti.demo.review.entity.SEDisposal;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SEDisposalMapper {

    int insert(SEDisposal seDisposal);

    int update(SEDisposal seDisposal);

    List<Map<String,Object>> getList(String caseInfoId);
}