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
 * 项目立项
 *
 * @author 
 * @email
 */
@TableName("lixiang")
public class LixiangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LixiangEntity() {

	}

	public LixiangEntity(T t) {
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
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 立项编号
     */
    @ColumnInfo(comment="立项编号",type="varchar(200)")
    @TableField(value = "lixiang_uuid_number")

    private String lixiangUuidNumber;


    /**
     * 项目名称
     */
    @ColumnInfo(comment="项目名称",type="varchar(200)")
    @TableField(value = "lixiang_name")

    private String lixiangName;


    /**
     * 项目类型
     */
    @ColumnInfo(comment="项目类型",type="int(11)")
    @TableField(value = "lixiang_types")

    private Integer lixiangTypes;


    /**
     * 项目地址
     */
    @ColumnInfo(comment="项目地址",type="varchar(200)")
    @TableField(value = "lixiang_address")

    private String lixiangAddress;


    /**
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "lixiang_file")

    private String lixiangFile;


    /**
     * 立项内容
     */
    @ColumnInfo(comment="立项内容",type="longtext")
    @TableField(value = "lixiang_content")

    private String lixiangContent;


    /**
     * 立项时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="立项时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 立项状态
     */
    @ColumnInfo(comment="立项状态",type="int(11)")
    @TableField(value = "lixiang_yesno_types")

    private Integer lixiangYesnoTypes;


    /**
     * 审核意见
     */
    @ColumnInfo(comment="审核意见",type="longtext")
    @TableField(value = "lixiang_yesno_text")

    private String lixiangYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "lixiang_shenhe_time")

    private Date lixiangShenheTime;


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
	 * 获取：立项编号
	 */
    public String getLixiangUuidNumber() {
        return lixiangUuidNumber;
    }
    /**
	 * 设置：立项编号
	 */

    public void setLixiangUuidNumber(String lixiangUuidNumber) {
        this.lixiangUuidNumber = lixiangUuidNumber;
    }
    /**
	 * 获取：项目名称
	 */
    public String getLixiangName() {
        return lixiangName;
    }
    /**
	 * 设置：项目名称
	 */

    public void setLixiangName(String lixiangName) {
        this.lixiangName = lixiangName;
    }
    /**
	 * 获取：项目类型
	 */
    public Integer getLixiangTypes() {
        return lixiangTypes;
    }
    /**
	 * 设置：项目类型
	 */

    public void setLixiangTypes(Integer lixiangTypes) {
        this.lixiangTypes = lixiangTypes;
    }
    /**
	 * 获取：项目地址
	 */
    public String getLixiangAddress() {
        return lixiangAddress;
    }
    /**
	 * 设置：项目地址
	 */

    public void setLixiangAddress(String lixiangAddress) {
        this.lixiangAddress = lixiangAddress;
    }
    /**
	 * 获取：附件
	 */
    public String getLixiangFile() {
        return lixiangFile;
    }
    /**
	 * 设置：附件
	 */

    public void setLixiangFile(String lixiangFile) {
        this.lixiangFile = lixiangFile;
    }
    /**
	 * 获取：立项内容
	 */
    public String getLixiangContent() {
        return lixiangContent;
    }
    /**
	 * 设置：立项内容
	 */

    public void setLixiangContent(String lixiangContent) {
        this.lixiangContent = lixiangContent;
    }
    /**
	 * 获取：立项时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：立项时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：立项状态
	 */
    public Integer getLixiangYesnoTypes() {
        return lixiangYesnoTypes;
    }
    /**
	 * 设置：立项状态
	 */

    public void setLixiangYesnoTypes(Integer lixiangYesnoTypes) {
        this.lixiangYesnoTypes = lixiangYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getLixiangYesnoText() {
        return lixiangYesnoText;
    }
    /**
	 * 设置：审核意见
	 */

    public void setLixiangYesnoText(String lixiangYesnoText) {
        this.lixiangYesnoText = lixiangYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getLixiangShenheTime() {
        return lixiangShenheTime;
    }
    /**
	 * 设置：审核时间
	 */

    public void setLixiangShenheTime(Date lixiangShenheTime) {
        this.lixiangShenheTime = lixiangShenheTime;
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
        return "Lixiang{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", lixiangUuidNumber=" + lixiangUuidNumber +
            ", lixiangName=" + lixiangName +
            ", lixiangTypes=" + lixiangTypes +
            ", lixiangAddress=" + lixiangAddress +
            ", lixiangFile=" + lixiangFile +
            ", lixiangContent=" + lixiangContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", lixiangYesnoTypes=" + lixiangYesnoTypes +
            ", lixiangYesnoText=" + lixiangYesnoText +
            ", lixiangShenheTime=" + DateUtil.convertString(lixiangShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
