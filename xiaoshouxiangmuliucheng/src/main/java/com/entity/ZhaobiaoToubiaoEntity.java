package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 投标
 *
 * @author 
 * @email
 */
@TableName("zhaobiao_toubiao")
public class ZhaobiaoToubiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhaobiaoToubiaoEntity() {

	}

	public ZhaobiaoToubiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 招标
     */
    @ColumnInfo(comment="招标",type="int(11)")
    @TableField(value = "zhaobiao_id")

    private Integer zhaobiaoId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 投标编号
     */
    @ColumnInfo(comment="投标编号",type="varchar(200)")
    @TableField(value = "zhaobiao_toubiao_uuid_number")

    private String zhaobiaoToubiaoUuidNumber;


    /**
     * 投标文件
     */
    @ColumnInfo(comment="投标文件",type="varchar(200)")
    @TableField(value = "zhaobiao_toubiao_file")

    private String zhaobiaoToubiaoFile;


    /**
     * 投标时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="投标时间",type="timestamp")
    @TableField(value = "zhaobiao_toubiao_time")

    private Date zhaobiaoToubiaoTime;


    /**
     * 投标备注
     */
    @ColumnInfo(comment="投标备注",type="longtext")
    @TableField(value = "zhaobiao_toubiao_content")

    private String zhaobiaoToubiaoContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="上传时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 投标状态
     */
    @ColumnInfo(comment="投标状态",type="int(11)")
    @TableField(value = "zhaobiao_toubiao_yesno_types")

    private Integer zhaobiaoToubiaoYesnoTypes;


    /**
     * 投标评分
     */
    @ColumnInfo(comment="投标评分",type="decimal(10,2)")
    @TableField(value = "zhaobiao_toubiao_pingfen")

    private Double zhaobiaoToubiaoPingfen;


    /**
     * 投标回复
     */
    @ColumnInfo(comment="投标回复",type="longtext")
    @TableField(value = "zhaobiao_toubiao_yesno_text")

    private String zhaobiaoToubiaoYesnoText;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="回复时间",type="timestamp")
    @TableField(value = "zhaobiao_toubiao_shenhe_time")

    private Date zhaobiaoToubiaoShenheTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：招标
	 */
    public Integer getZhaobiaoId() {
        return zhaobiaoId;
    }
    /**
	 * 设置：招标
	 */

    public void setZhaobiaoId(Integer zhaobiaoId) {
        this.zhaobiaoId = zhaobiaoId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：投标编号
	 */
    public String getZhaobiaoToubiaoUuidNumber() {
        return zhaobiaoToubiaoUuidNumber;
    }
    /**
	 * 设置：投标编号
	 */

    public void setZhaobiaoToubiaoUuidNumber(String zhaobiaoToubiaoUuidNumber) {
        this.zhaobiaoToubiaoUuidNumber = zhaobiaoToubiaoUuidNumber;
    }
    /**
	 * 获取：投标文件
	 */
    public String getZhaobiaoToubiaoFile() {
        return zhaobiaoToubiaoFile;
    }
    /**
	 * 设置：投标文件
	 */

    public void setZhaobiaoToubiaoFile(String zhaobiaoToubiaoFile) {
        this.zhaobiaoToubiaoFile = zhaobiaoToubiaoFile;
    }
    /**
	 * 获取：投标时间
	 */
    public Date getZhaobiaoToubiaoTime() {
        return zhaobiaoToubiaoTime;
    }
    /**
	 * 设置：投标时间
	 */

    public void setZhaobiaoToubiaoTime(Date zhaobiaoToubiaoTime) {
        this.zhaobiaoToubiaoTime = zhaobiaoToubiaoTime;
    }
    /**
	 * 获取：投标备注
	 */
    public String getZhaobiaoToubiaoContent() {
        return zhaobiaoToubiaoContent;
    }
    /**
	 * 设置：投标备注
	 */

    public void setZhaobiaoToubiaoContent(String zhaobiaoToubiaoContent) {
        this.zhaobiaoToubiaoContent = zhaobiaoToubiaoContent;
    }
    /**
	 * 获取：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：上传时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：投标状态
	 */
    public Integer getZhaobiaoToubiaoYesnoTypes() {
        return zhaobiaoToubiaoYesnoTypes;
    }
    /**
	 * 设置：投标状态
	 */

    public void setZhaobiaoToubiaoYesnoTypes(Integer zhaobiaoToubiaoYesnoTypes) {
        this.zhaobiaoToubiaoYesnoTypes = zhaobiaoToubiaoYesnoTypes;
    }
    /**
	 * 获取：投标评分
	 */
    public Double getZhaobiaoToubiaoPingfen() {
        return zhaobiaoToubiaoPingfen;
    }
    /**
	 * 设置：投标评分
	 */

    public void setZhaobiaoToubiaoPingfen(Double zhaobiaoToubiaoPingfen) {
        this.zhaobiaoToubiaoPingfen = zhaobiaoToubiaoPingfen;
    }
    /**
	 * 获取：投标回复
	 */
    public String getZhaobiaoToubiaoYesnoText() {
        return zhaobiaoToubiaoYesnoText;
    }
    /**
	 * 设置：投标回复
	 */

    public void setZhaobiaoToubiaoYesnoText(String zhaobiaoToubiaoYesnoText) {
        this.zhaobiaoToubiaoYesnoText = zhaobiaoToubiaoYesnoText;
    }
    /**
	 * 获取：回复时间
	 */
    public Date getZhaobiaoToubiaoShenheTime() {
        return zhaobiaoToubiaoShenheTime;
    }
    /**
	 * 设置：回复时间
	 */

    public void setZhaobiaoToubiaoShenheTime(Date zhaobiaoToubiaoShenheTime) {
        this.zhaobiaoToubiaoShenheTime = zhaobiaoToubiaoShenheTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ZhaobiaoToubiao{" +
            ", id=" + id +
            ", zhaobiaoId=" + zhaobiaoId +
            ", yonghuId=" + yonghuId +
            ", zhaobiaoToubiaoUuidNumber=" + zhaobiaoToubiaoUuidNumber +
            ", zhaobiaoToubiaoFile=" + zhaobiaoToubiaoFile +
            ", zhaobiaoToubiaoTime=" + DateUtil.convertString(zhaobiaoToubiaoTime,"yyyy-MM-dd") +
            ", zhaobiaoToubiaoContent=" + zhaobiaoToubiaoContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", zhaobiaoToubiaoYesnoTypes=" + zhaobiaoToubiaoYesnoTypes +
            ", zhaobiaoToubiaoPingfen=" + zhaobiaoToubiaoPingfen +
            ", zhaobiaoToubiaoYesnoText=" + zhaobiaoToubiaoYesnoText +
            ", zhaobiaoToubiaoShenheTime=" + DateUtil.convertString(zhaobiaoToubiaoShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
