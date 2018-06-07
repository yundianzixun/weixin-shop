package com.itunion.shop.enums;


/**
 * @author 郑亮亮
 * 2018年03月28日16:44:19
 * 该枚举汇总了所有的Log信息，
 * 可用Messages.Log_Error_birthday.toString()进行访问
 */ 
public enum Message {

	ERROR_SYSTEM("系统异常"),
	ERROR_DATABASE("数据库异常"),
	QUERY_NO_RESULT("未查询到结果"),
	QUERY_SUCCESS("查询成功"),
	FEEDBACK_SUCCESS("反馈成功"),
    ERROR_PARAMETER("参数异常")
	;

	
	private String message;
	
	private Message(String msg) {
		this.message = msg;
	}
	
	public String toString() {
		return this.message;
	}
}
