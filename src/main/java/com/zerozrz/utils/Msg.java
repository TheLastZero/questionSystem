package com.zerozrz.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用的返回类
 * @author zero
 *
 */
public class Msg {

	//状态码 8200-成功 xxx-失败
	private int code;
	//提示信息
	private String message;
	
	//用户返回给浏览器的数据
	private Map<String, Object> data = new HashMap<String, Object>();

	public static Msg success(){
		Msg result = new Msg();
		result.setCode(8200);
		result.setMessage("成功");
		return result;
	}
	
	public static Msg fail(){
		Msg result = new Msg();
		result.setCode(200);
		result.setMessage("失败");
		return result;
	}
	
	public Msg add(String key,Object value){
		this.getData().put(key, value);
		return this;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}
}
