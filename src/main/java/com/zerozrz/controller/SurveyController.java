package com.zerozrz.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zerozrz.service.SurveyService;
import com.zerozrz.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

//    @RequestMapping("/getPageListByStatus")
//    @ResponseBody
//    public Msg getPageListByStatus(@RequestParam(value="pn",defaultValue="1")Integer pn,//查询页码，默认为第一页
//                                   @RequestParam(value="surveyStatus",defaultValue="-1")Integer surveyStatus,//-1表示查询全部
//                                   @RequestParam(value="surveyName",defaultValue="-1")String surveyName,//有名字的话，把名字的条件也带上
//                                   @RequestParam(value="userId")Integer userId){//根据用户id查询
//
//        PageHelper.startPage(pn,3);//查询页码，每页三条数据
//
//        //按照问卷状态和用户id查询
//        List<Survey> sList = surveyService.getPageListByStatus(surveyStatus,surveyName,userId);
//
//        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了
//        //封装了详细的分页信息，包括有我们查询出来的数据，传入连续显示的页数
//        PageInfo page = new PageInfo(sList,5);
//
//
//        return Msg.success().add("pageInfo", page);
//    }

}
