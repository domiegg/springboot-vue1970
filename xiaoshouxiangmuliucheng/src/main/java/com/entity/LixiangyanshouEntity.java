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
 * 项目验收
 *
 * @author 
 * @email
 */
@TableName("lixiangyanshou")
public class LixiangyanshouEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LixiangyanshouEntity() {

	}

	public LixiangyanshouEntity(T t) {
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
     * 立项项目
     */
    @ColumnInfo(comment="立项项目",type="int(11)")
    @TableField(value = "lixiang_id")

    private Integer lixiangId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 项目验收编号
     */
    @ColumnInfo(comment="项目验收编号",type="varchar(200)")
    @TableField(value = "lixiangyanshou_uuid_number")

    private String lixiangyanshouUuidNumber;


    /**
     * 验收标题
     */
    @ColumnInfo(comment="验收标题",type="varchar(200)")
    @TableField(value = "lixiangyanshou_name")

    private String lixiangyanshouName;


    /**
     * 项目验收附件
     */
    @ColumnInfo(comment="项目验收附件",type="varchar(200)")
    @TableField(value = "lixiangyanshou_file")

    private String lixiangyanshouFile;


    /**
     * 验收地点
     */
    @ColumnInfo(comment="验收地点",type="varchar(200)")
    @TableField(value = "lixiangyanshou_address")

    private String lixiangyanshouAddress;


    /**
     * 验收时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="验收时间",type="timestamp")
    @TableField(value = "lixiangyanshou_time")

    private Date lixiangyanshouTime;


    /**
     * 验收内容
     */
    @ColumnInfo(comment="验收内容",type="longtext")
    @TableField(value = "lixiangyanshou_content")

    private String lixiangyanshouContent;


    /**
     * 验收结果
     */
    @ColumnInfo(comment="验收结果",type="varchar(200)")
    @TableField(value = "lixiangyanshou_jieguo")

    private String lixiangyanshouJieguo;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="上传时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 审核状态
     */
    @ColumnInfo(comment="审核状态",type="int(11)")
    @TableField(value = "lixiangyanshou_yesno_types")

    private Integer lixiangyanshouYesnoTypes;


    /**
     * 审核意见
     */
    @ColumnInfo(comment="审核意见",type="longtext")
    @TableField(value = "lixiangyanshou_yesno_text")

    private String lixiangyanshouYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "lixiangyanshou_shenhe_time")

    private Date lixiangyanshouShenheTime;


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
	 * 获取：立项项目
	 */
    public Integer getLixiangId() {
        return lixiangId;
    }
    /**
	 * 设置：立项项目
	 */

    public void setLixiangId(Integer lixiangId) {
        this.lixiangId = lixiangId;
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
	 * 获取：项目验收编号
	 */
    public String getLixiangyanshouUuidNumber() {
        return lixiangyanshouUuidNumber;
    }
    /**
	 * 设置：项目验收编号
	 */

    public void setLixiangyanshouUuidNumber(String lixiangyanshouUuidNumber) {
        this.lixiangyanshouUuidNumber = lixiangyanshouUuidNumber;
    }
    /**
	 * 获取：验收标题
	 */
    public String getLixiangyanshouName() {
        return lixiangyanshouName;
    }
    /**
	 * 设置：验收标题
	 */

    public void setLixiangyanshouName(String lixiangyanshouName) {
        this.lixiangyanshouName = lixiangyanshouName;
    }
    /**
	 * 获取：项目验收附件
	 */
    public String getLixiangyanshouFile() {
        return lixiangyanshouFile;
    }
    /**
	 * 设置：项目验收附件
	 */

    public void setLixiangyanshouFile(String lixiangyanshouFile) {
        this.lixiangyanshouFile = lixiangyanshouFile;
    }
    /**
	 * 获取：验收地点
	 */
    public String getLixiangyanshouAddress() {
        return lixiangyanshouAddress;
    }
    /**
	 * 设置：验收地点
	 */

    public void setLixiangyanshouAddress(String lixiangyanshouAddress) {
        this.lixiangyanshouAddress = lixiangyanshouAddress;
    }
    /**
	 * 获取：验收时间
	 */
    public Date getLixiangyanshouTime() {
        return lixiangyanshouTime;
    }
    /**
	 * 设置：验收时间
	 */

    public void setLixiangyanshouTime(Date lixiangyanshouTime) {
        this.lixiangyanshouTime = lixiangyanshouTime;
    }
    /**
	 * 获取：验收内容
	 */
    public String getLixiangyanshouContent() {
        return lixiangyanshouContent;
    }
    /**
	 * 设置：验收内容
	 */

    public void setLixiangyanshouContent(String lixiangyanshouContent) {
        this.lixiangyanshouContent = lixiangyanshouContent;
    }
    /**
	 * 获取：验收结果
	 */
    public String getLixiangyanshouJieguo() {
        return lixiangyanshouJieguo;
    }
    /**
	 * 设置：验收结果
	 */

    public void setLixiangyanshouJieguo(String lixiangyanshouJieguo) {
        this.lixiangyanshouJieguo = lixiangyanshouJieguo;
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
	 * 获取：审核状态
	 */
    public Integer getLixiangyanshouYesnoTypes() {
        return lixiangyanshouYesnoTypes;
    }
    /**
	 * 设置：审核状态
	 */

    public void setLixiangyanshouYesnoTypes(Integer lixiangyanshouYesnoTypes) {
        this.lixiangyanshouYesnoTypes = lixiangyanshouYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getLixiangyanshouYesnoText() {
        return lixiangyanshouYesnoText;
    }
    /**
	 * 设置：审核意见
	 */

    public void setLixiangyanshouYesnoText(String lixiangyanshouYesnoText) {
        this.lixiangyanshouYesnoText = lixiangyanshouYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getLixiangyanshouShenheTime() {
        return lixiangyanshouShenheTime;
    }
    /**
	 * 设置：审核时间
	 */

    public void setLixiangyanshouShenheTime(Date lixiangyanshouShenheTime) {
        this.lixiangyanshouShenheTime = lixiangyanshouShenheTime;
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
        return "Lixiangyanshou{" +
            ", id=" + id +
            ", lixiangId=" + lixiangId +
            ", yonghuId=" + yonghuId +
            ", lixiangyanshouUuidNumber=" + lixiangyanshouUuidNumber +
            ", lixiangyanshouName=" + lixiangyanshouName +
            ", lixiangyanshouFile=" + lixiangyanshouFile +
            ", lixiangyanshouAddress=" + lixiangyanshouAddress +
            ", lixiangyanshouTime=" + DateUtil.convertString(lixiangyanshouTime,"yyyy-MM-dd") +
            ", lixiangyanshouContent=" + lixiangyanshouContent +
            ", lixiangyanshouJieguo=" + lixiangyanshouJieguo +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", lixiangyanshouYesnoTypes=" + lixiangyanshouYesnoTypes +
            ", lixiangyanshouYesnoText=" + lixiangyanshouYesnoText +
            ", lixiangyanshouShenheTime=" + DateUtil.convertString(lixiangyanshouShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
