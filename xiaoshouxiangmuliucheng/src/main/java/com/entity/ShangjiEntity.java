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
 * 商机
 *
 * @author 
 * @email
 */
@TableName("shangji")
public class ShangjiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShangjiEntity() {

	}

	public ShangjiEntity(T t) {
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
     * 商机编号
     */
    @ColumnInfo(comment="商机编号",type="varchar(200)")
    @TableField(value = "shangji_uuid_number")

    private String shangjiUuidNumber;


    /**
     * 商机标题
     */
    @ColumnInfo(comment="商机标题",type="varchar(200)")
    @TableField(value = "shangji_name")

    private String shangjiName;


    /**
     * 商机发现地址
     */
    @ColumnInfo(comment="商机发现地址",type="varchar(200)")
    @TableField(value = "shangji_address")

    private String shangjiAddress;


    /**
     * 发现时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="发现时间",type="timestamp")
    @TableField(value = "shangji_time")

    private Date shangjiTime;


    /**
     * 商机等级
     */
    @ColumnInfo(comment="商机等级",type="int(11)")
    @TableField(value = "shangji_dengji_types")

    private Integer shangjiDengjiTypes;


    /**
     * 商机类型
     */
    @ColumnInfo(comment="商机类型",type="int(11)")
    @TableField(value = "shangji_types")

    private Integer shangjiTypes;


    /**
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "shangji_file")

    private String shangjiFile;


    /**
     * 商机内容
     */
    @ColumnInfo(comment="商机内容",type="longtext")
    @TableField(value = "shangji_content")

    private String shangjiContent;


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
	 * 获取：商机编号
	 */
    public String getShangjiUuidNumber() {
        return shangjiUuidNumber;
    }
    /**
	 * 设置：商机编号
	 */

    public void setShangjiUuidNumber(String shangjiUuidNumber) {
        this.shangjiUuidNumber = shangjiUuidNumber;
    }
    /**
	 * 获取：商机标题
	 */
    public String getShangjiName() {
        return shangjiName;
    }
    /**
	 * 设置：商机标题
	 */

    public void setShangjiName(String shangjiName) {
        this.shangjiName = shangjiName;
    }
    /**
	 * 获取：商机发现地址
	 */
    public String getShangjiAddress() {
        return shangjiAddress;
    }
    /**
	 * 设置：商机发现地址
	 */

    public void setShangjiAddress(String shangjiAddress) {
        this.shangjiAddress = shangjiAddress;
    }
    /**
	 * 获取：发现时间
	 */
    public Date getShangjiTime() {
        return shangjiTime;
    }
    /**
	 * 设置：发现时间
	 */

    public void setShangjiTime(Date shangjiTime) {
        this.shangjiTime = shangjiTime;
    }
    /**
	 * 获取：商机等级
	 */
    public Integer getShangjiDengjiTypes() {
        return shangjiDengjiTypes;
    }
    /**
	 * 设置：商机等级
	 */

    public void setShangjiDengjiTypes(Integer shangjiDengjiTypes) {
        this.shangjiDengjiTypes = shangjiDengjiTypes;
    }
    /**
	 * 获取：商机类型
	 */
    public Integer getShangjiTypes() {
        return shangjiTypes;
    }
    /**
	 * 设置：商机类型
	 */

    public void setShangjiTypes(Integer shangjiTypes) {
        this.shangjiTypes = shangjiTypes;
    }
    /**
	 * 获取：附件
	 */
    public String getShangjiFile() {
        return shangjiFile;
    }
    /**
	 * 设置：附件
	 */

    public void setShangjiFile(String shangjiFile) {
        this.shangjiFile = shangjiFile;
    }
    /**
	 * 获取：商机内容
	 */
    public String getShangjiContent() {
        return shangjiContent;
    }
    /**
	 * 设置：商机内容
	 */

    public void setShangjiContent(String shangjiContent) {
        this.shangjiContent = shangjiContent;
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
        return "Shangji{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", shangjiUuidNumber=" + shangjiUuidNumber +
            ", shangjiName=" + shangjiName +
            ", shangjiAddress=" + shangjiAddress +
            ", shangjiTime=" + DateUtil.convertString(shangjiTime,"yyyy-MM-dd") +
            ", shangjiDengjiTypes=" + shangjiDengjiTypes +
            ", shangjiTypes=" + shangjiTypes +
            ", shangjiFile=" + shangjiFile +
            ", shangjiContent=" + shangjiContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
