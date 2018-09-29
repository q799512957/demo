package com.activiti.demo.decision.rest;

import com.activiti.demo.decision.entity.SHRecord;
import com.activiti.demo.decision.service.SHRecordService;
import com.activiti.demo.entity.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sHRecord")
@Api(tags = {"听证笔录"})
public class SHRecordRest {

    @Autowired
    private SHRecordService service;

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
    public ResultBean update(@RequestBody SHRecord shRecord) {
        boolean r = service.update(shRecord);
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
    public ResultBean insert(@RequestBody SHRecord shRecord) {
        ResultBean resultBean = new ResultBean();
        boolean r = service.insert(shRecord);
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
