package com.zerozrz.controller;

import com.zerozrz.utils.IpAddressUtil;
import com.zerozrz.utils.Msg;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.net.util.IPAddressUtil;

import javax.servlet.http.HttpServletRequest;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import static net.sf.json.JSONArray.fromObject;

@RequestMapping("/test")
@Controller
public class testController {

    /**
     * 测试post请求
     * @param object
     * @param request
     * @return
     */
    @RequestMapping("/cors")
    @ResponseBody
    public Msg testJSONCORS(@RequestBody Object object, HttpServletRequest request){

        System.out.println("接收到的json为："+object);

        String ip = IpAddressUtil.getIpAdrress(request);

        System.out.println("ip地址为：" + ip);

        JSONObject o = JSONObject.fromObject(object);
        o.accumulate("ip地址：",ip);



        return Msg.success().add("d1",o).add("d2",o);
    }

    /**
     * 测试get请求
     * @param request
     * @return
     */
    @RequestMapping("/getcors")
    @ResponseBody
    public Msg testJSONCORS2(HttpServletRequest request){


        String ip = IpAddressUtil.getIpAdrress(request);

        System.out.println("ip地址为：" + ip);

        Map<String,Object> map = new ConcurrentHashMap<String, Object>();
        map.put("ip:地址" , ip);
        map.put("服务器编号",1);
        map.put("服务器名字","火之高兴");


        return Msg.success().add("服务器信息",map);
    }

}
