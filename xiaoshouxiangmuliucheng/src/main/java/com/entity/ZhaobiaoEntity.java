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
 * 招标
 *
 * @author 
 * @email
 */
@TableName("zhaobiao")
public class ZhaobiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhaobiaoEntity() {

	}

	public ZhaobiaoEntity(T t) {
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
     * 企业
     */
    @ColumnInfo(comment="企业",type="int(11)")
    @TableField(value = "qiye_id")

    private Integer qiyeId;


    /**
     * 招标编号
     */
    @ColumnInfo(comment="招标编号",type="varchar(200)")
    @TableField(value = "zhaobiao_uuid_number")

    private String zhaobiaoUuidNumber;


    /**
     * 招标标题
     */
    @ColumnInfo(comment="招标标题",type="varchar(200)")
    @TableField(value = "zhaobiao_name")

    private String zhaobiaoName;


    /**
     * 招标地点
     */
    @ColumnInfo(comment="招标地点",type="varchar(200)")
    @TableField(value = "zhaobiao_address")

    private String zhaobiaoAddress;


    /**
     * 招标时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="招标时间",type="timestamp")
    @TableField(value = "zhaobiao_time")

    private Date zhaobiaoTime;


    /**
     * 招标类型
     */
    @ColumnInfo(comment="招标类型",type="int(11)")
    @TableField(value = "zhaobiao_types")

    private Integer zhaobiaoTypes;


    /**
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "zhaobiao_file")

    private String zhaobiaoFile;


    /**
     * 招标介绍
     */
    @ColumnInfo(comment="招标介绍",type="longtext")
    @TableField(value = "zhaobiao_content")

    private String zhaobiaoContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="上传时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 获取：企业
	 */
    public Integer getQiyeId() {
        return qiyeId;
    }
    /**
	 * 设置：企业
	 */

    public void setQiyeId(Integer qiyeId) {
        this.qiyeId = qiyeId;
    }
    /**
	 * 获取：招标编号
	 */
    public String getZhaobiaoUuidNumber() {
        return zhaobiaoUuidNumber;
    }
    /**
	 * 设置：招标编号
	 */

    public void setZhaobiaoUuidNumber(String zhaobiaoUuidNumber) {
        this.zhaobiaoUuidNumber = zhaobiaoUuidNumber;
    }
    /**
	 * 获取：招标标题
	 */
    public String getZhaobiaoName() {
        return zhaobiaoName;
    }
    /**
	 * 设置：招标标题
	 */

    public void setZhaobiaoName(String zhaobiaoName) {
        this.zhaobiaoName = zhaobiaoName;
    }
    /**
	 * 获取：招标地点
	 */
    public String getZhaobiaoAddress() {
        return zhaobiaoAddress;
    }
    /**
	 * 设置：招标地点
	 */

    public void setZhaobiaoAddress(String zhaobiaoAddress) {
        this.zhaobiaoAddress = zhaobiaoAddress;
    }
    /**
	 * 获取：招标时间
	 */
    public Date getZhaobiaoTime() {
        return zhaobiaoTime;
    }
    /**
	 * 设置：招标时间
	 */

    public void setZhaobiaoTime(Date zhaobiaoTime) {
        this.zhaobiaoTime = zhaobiaoTime;
    }
    /**
	 * 获取：招标类型
	 */
    public Integer getZhaobiaoTypes() {
        return zhaobiaoTypes;
    }
    /**
	 * 设置：招标类型
	 */

    public void setZhaobiaoTypes(Integer zhaobiaoTypes) {
        this.zhaobiaoTypes = zhaobiaoTypes;
    }
    /**
	 * 获取：附件
	 */
    public String getZhaobiaoFile() {
        return zhaobiaoFile;
    }
    /**
	 * 设置：附件
	 */

    public void setZhaobiaoFile(String zhaobiaoFile) {
        this.zhaobiaoFile = zhaobiaoFile;
    }
    /**
	 * 获取：招标介绍
	 */
    public String getZhaobiaoContent() {
        return zhaobiaoContent;
    }
    /**
	 * 设置：招标介绍
	 */

    public void setZhaobiaoContent(String zhaobiaoContent) {
        this.zhaobiaoContent = zhaobiaoContent;
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
        return "Zhaobiao{" +
            ", id=" + id +
            ", qiyeId=" + qiyeId +
            ", zhaobiaoUuidNumber=" + zhaobiaoUuidNumber +
            ", zhaobiaoName=" + zhaobiaoName +
            ", zhaobiaoAddress=" + zhaobiaoAddress +
            ", zhaobiaoTime=" + DateUtil.convertString(zhaobiaoTime,"yyyy-MM-dd") +
            ", zhaobiaoTypes=" + zhaobiaoTypes +
            ", zhaobiaoFile=" + zhaobiaoFile +
            ", zhaobiaoContent=" + zhaobiaoContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
