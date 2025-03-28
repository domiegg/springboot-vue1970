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
 * 项目评审
 *
 * @author 
 * @email
 */
@TableName("lixiang_pingshen")
public class LixiangPingshenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LixiangPingshenEntity() {

	}

	public LixiangPingshenEntity(T t) {
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
     * 项目
     */
    @ColumnInfo(comment="项目",type="int(11)")
    @TableField(value = "lixiang_id")

    private Integer lixiangId;


    /**
     * 项目评审编号
     */
    @ColumnInfo(comment="项目评审编号",type="varchar(200)")
    @TableField(value = "lixiang_pingshen_uuid_number")

    private String lixiangPingshenUuidNumber;


    /**
     * 项目评审标题
     */
    @ColumnInfo(comment="项目评审标题",type="varchar(200)")
    @TableField(value = "lixiang_pingshen_name")

    private String lixiangPingshenName;


    /**
     * 项目评审类型
     */
    @ColumnInfo(comment="项目评审类型",type="int(11)")
    @TableField(value = "lixiang_pingshen_types")

    private Integer lixiangPingshenTypes;


    /**
     * 评审附件
     */
    @ColumnInfo(comment="评审附件",type="varchar(200)")
    @TableField(value = "lixiang_pingshen_file")

    private String lixiangPingshenFile;


    /**
     * 项目评审报告
     */
    @ColumnInfo(comment="项目评审报告",type="longtext")
    @TableField(value = "lixiang_pingshen_content")

    private String lixiangPingshenContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="上传时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 项目评审状态
     */
    @ColumnInfo(comment="项目评审状态",type="int(11)")
    @TableField(value = "lixiang_pingshen_yesno_types")

    private Integer lixiangPingshenYesnoTypes;


    /**
     * 审核意见
     */
    @ColumnInfo(comment="审核意见",type="longtext")
    @TableField(value = "lixiang_pingshen_yesno_text")

    private String lixiangPingshenYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "lixiang_pingshen_shenhe_time")

    private Date lixiangPingshenShenheTime;


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
	 * 获取：项目
	 */
    public Integer getLixiangId() {
        return lixiangId;
    }
    /**
	 * 设置：项目
	 */

    public void setLixiangId(Integer lixiangId) {
        this.lixiangId = lixiangId;
    }
    /**
	 * 获取：项目评审编号
	 */
    public String getLixiangPingshenUuidNumber() {
        return lixiangPingshenUuidNumber;
    }
    /**
	 * 设置：项目评审编号
	 */

    public void setLixiangPingshenUuidNumber(String lixiangPingshenUuidNumber) {
        this.lixiangPingshenUuidNumber = lixiangPingshenUuidNumber;
    }
    /**
	 * 获取：项目评审标题
	 */
    public String getLixiangPingshenName() {
        return lixiangPingshenName;
    }
    /**
	 * 设置：项目评审标题
	 */

    public void setLixiangPingshenName(String lixiangPingshenName) {
        this.lixiangPingshenName = lixiangPingshenName;
    }
    /**
	 * 获取：项目评审类型
	 */
    public Integer getLixiangPingshenTypes() {
        return lixiangPingshenTypes;
    }
    /**
	 * 设置：项目评审类型
	 */

    public void setLixiangPingshenTypes(Integer lixiangPingshenTypes) {
        this.lixiangPingshenTypes = lixiangPingshenTypes;
    }
    /**
	 * 获取：评审附件
	 */
    public String getLixiangPingshenFile() {
        return lixiangPingshenFile;
    }
    /**
	 * 设置：评审附件
	 */

    public void setLixiangPingshenFile(String lixiangPingshenFile) {
        this.lixiangPingshenFile = lixiangPingshenFile;
    }
    /**
	 * 获取：项目评审报告
	 */
    public String getLixiangPingshenContent() {
        return lixiangPingshenContent;
    }
    /**
	 * 设置：项目评审报告
	 */

    public void setLixiangPingshenContent(String lixiangPingshenContent) {
        this.lixiangPingshenContent = lixiangPingshenContent;
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
	 * 获取：项目评审状态
	 */
    public Integer getLixiangPingshenYesnoTypes() {
        return lixiangPingshenYesnoTypes;
    }
    /**
	 * 设置：项目评审状态
	 */

    public void setLixiangPingshenYesnoTypes(Integer lixiangPingshenYesnoTypes) {
        this.lixiangPingshenYesnoTypes = lixiangPingshenYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getLixiangPingshenYesnoText() {
        return lixiangPingshenYesnoText;
    }
    /**
	 * 设置：审核意见
	 */

    public void setLixiangPingshenYesnoText(String lixiangPingshenYesnoText) {
        this.lixiangPingshenYesnoText = lixiangPingshenYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getLixiangPingshenShenheTime() {
        return lixiangPingshenShenheTime;
    }
    /**
	 * 设置：审核时间
	 */

    public void setLixiangPingshenShenheTime(Date lixiangPingshenShenheTime) {
        this.lixiangPingshenShenheTime = lixiangPingshenShenheTime;
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
        return "LixiangPingshen{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", lixiangId=" + lixiangId +
            ", lixiangPingshenUuidNumber=" + lixiangPingshenUuidNumber +
            ", lixiangPingshenName=" + lixiangPingshenName +
            ", lixiangPingshenTypes=" + lixiangPingshenTypes +
            ", lixiangPingshenFile=" + lixiangPingshenFile +
            ", lixiangPingshenContent=" + lixiangPingshenContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", lixiangPingshenYesnoTypes=" + lixiangPingshenYesnoTypes +
            ", lixiangPingshenYesnoText=" + lixiangPingshenYesnoText +
            ", lixiangPingshenShenheTime=" + DateUtil.convertString(lixiangPingshenShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
