package com.gx.bean;

import java.util.HashMap;
import java.util.Map;

import com.gx.bean.Msg;

public class Msg {
	private int code;

	private String msg;

	private Map<String,Object>extend=new HashMap<String,Object>();
	
	public static Msg success(){
		Msg result=new Msg();
		result.setCode(100);
		result.setMsg("请求成功");
		return result;
	}
	public static Msg fail(){
		Msg result=new Msg();
		result.setCode(200);
		result.setMsg("请求失败");
		return result;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Object> getExtend() {
		return extend;
	}
	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
	public Msg add(String key, Object value) {
		// TODO Auto-generated method stub
		this.getExtend().put(key,value);
		return this;
	}
}