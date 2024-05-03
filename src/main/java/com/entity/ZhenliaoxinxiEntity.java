package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 诊疗信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-23 18:27:37
 */
@TableName("zhenliaoxinxi")
public class ZhenliaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhenliaoxinxiEntity() {
		
	}
	
	public ZhenliaoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 诊疗编号
	 */
					
	private String zhenliaobianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zhenliaoshijian;
	
	/**
	 * 诊疗内容
	 */
					
	private String zhenliaoneirong;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：诊疗编号
	 */
	public void setZhenliaobianhao(String zhenliaobianhao) {
		this.zhenliaobianhao = zhenliaobianhao;
	}
	/**
	 * 获取：诊疗编号
	 */
	public String getZhenliaobianhao() {
		return zhenliaobianhao;
	}
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
