package com.uns.uu.service;


public interface MsgRecordService {
	public int record(long dest, long src, long help, String msg, Byte msgType, int sequence);
	
	/**添加客服消息*/
	public int recordVisitor(long dest, long src, long help, String msg, Byte msgType, int sequence);
	
	/**返回缓存消息*//*
	public List<Map<String, Object>> searchLocalRecord();*/
}
