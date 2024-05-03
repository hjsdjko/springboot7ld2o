package com.entity.vo;

import com.entity.ZhenliaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 诊疗信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-23 18:27:37
 */
public class ZhenliaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 患者账号
	 */
	
	private String huanzhezhanghao;
		
	/**
	 * 患者姓名
	 */
	
	private String huanzhexingming;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 医生账号
	 */
	
	private String yishengzhanghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 所属诊室
	 */
	
	private String suoshuzhenshi;
		
	/**
	 * 诊疗时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhenliaoshijian;
		
	/**
	 * 诊疗内容
	 */
	
	private String zhenliaoneirong;
				
	
	/**
	 * 设置：患者账号
	 */
	 
	public void setHuanzhezhanghao(String huanzhezhanghao) {
		this.huanzhezhanghao = huanzhezhanghao;
	}
	
	/**
	 * 获取：患者账号
	 */
	public String getHuanzhezhanghao() {
		return huanzhezhanghao;
	}
				
	
	/**
	 * 设置：患者姓名
	 */
	 
	public void setHuanzhexingming(String huanzhexingming) {
		this.huanzhexingming = huanzhexingming;
	}
	
	/**
	 * 获取：患者姓名
	 */
	public String getHuanzhexingming() {
		return huanzhexingming;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：医生账号
	 */
	 
	public void setYishengzhanghao(String yishengzhanghao) {
		this.yishengzhanghao = yishengzhanghao;
	}
	
	/**
	 * 获取：医生账号
	 */
	public String getYishengzhanghao() {
		return yishengzhanghao;
	}
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：所属诊室
	 */
	 
	public void setSuoshuzhenshi(String suoshuzhenshi) {
		this.suoshuzhenshi = suoshuzhenshi;
	}
	
	/**
	 * 获取：所属诊室
	 */
	public String getSuoshuzhenshi() {
		return suoshuzhenshi;
	}
				
	
	/**
	 * 设置：诊疗时间
	 */
	 
	public void setZhenliaoshijian(Date zhenliaoshijian) {
		this.zhenliaoshijian = zhenliaoshijian;
	}
	
	/**
	 * 获取：诊疗时间
	 */
	public Date getZhenliaoshijian() {
		return zhenliaoshijian;
	}
				
	
	/**
	 * 设置：诊疗内容
	 */
	 
	public void setZhenliaoneirong(String zhenliaoneirong) {
		this.zhenliaoneirong = zhenliaoneirong;
	}
	
	/**
	 * 获取：诊疗内容
	 */
	public String getZhenliaoneirong() {
		return zhenliaoneirong;
	}
			
}
