package com.activiti.demo.review.rest;

import com.activiti.demo.review.service.SSDefenceService;
import com.activiti.demo.entity.ResultBean;
import com.activiti.demo.review.entity.SSDefence;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sSDefence")
@Api(tags = {"陈述申辩书"})
public class SSDefenceRest {

    @Autowired
    private SSDefenceService service;

    @ApiOperation(value = "获取列表",httpMethod = "GET")
    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    @ResponseBody
    public ResultBean getList(@RequestParam String caseInfoId) {
        List<Map<String,Object>> list = new ArrayList<>();
        list = service.getList(caseInfoId);
        ResultBean resultBean = new ResultBean();
            resultBean.setCode("200");
            resultBean.setMessage("获取列表成功");
            resultBean.setData(list);
        return resultBean;
    }

    @ApiOperation(value = "更新信息",httpMethod = "POST")
    @RequestMapping(value = "/update", method = {RequestMethod.POST})
    @ResponseBody
    public ResultBean update(@RequestBody SSDefence ssDefence) {
        boolean r = service.update(ssDefence);
        ResultBean resultBean = new ResultBean();
        if (r){
            resultBean.setCode("200");
            resultBean.setMessage("更新信息成功");
        }else {
            resultBean.setCode("201");
            resultBean.setMessage("更新信息失败");
        }
        return resultBean;
    }

    @ApiOperation(value = "添加信息",httpMethod = "POST")
    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ResponseBody
    public ResultBean insert(@RequestBody SSDefence ssDefence) {
        ResultBean resultBean = new ResultBean();
        boolean r = service.insert(ssDefence);
        if (r){
            resultBean.setCode("200");
            resultBean.setMessage("添加信息成功");
        }else {
            resultBean.setCode("201");
            resultBean.setMessage("添加信息失败");
        }
        return resultBean;
    }

}
