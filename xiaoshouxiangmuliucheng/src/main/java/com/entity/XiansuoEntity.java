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
 * 线索
 *
 * @author 
 * @email
 */
@TableName("xiansuo")
public class XiansuoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiansuoEntity() {

	}

	public XiansuoEntity(T t) {
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
     * 线索编号
     */
    @ColumnInfo(comment="线索编号",type="varchar(200)")
    @TableField(value = "xiansuo_uuid_number")

    private String xiansuoUuidNumber;


    /**
     * 线索标题
     */
    @ColumnInfo(comment="线索标题",type="varchar(200)")
    @TableField(value = "xiansuo_name")

    private String xiansuoName;


    /**
     * 线索发现地址
     */
    @ColumnInfo(comment="线索发现地址",type="varchar(200)")
    @TableField(value = "xiansuo_address")

    private String xiansuoAddress;


    /**
     * 发现时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="发现时间",type="timestamp")
    @TableField(value = "xiansuo_time")

    private Date xiansuoTime;


    /**
     * 线索等级
     */
    @ColumnInfo(comment="线索等级",type="int(11)")
    @TableField(value = "xiansuo_dengji_types")

    private Integer xiansuoDengjiTypes;


    /**
     * 线索类型
     */
    @ColumnInfo(comment="线索类型",type="int(11)")
    @TableField(value = "xiansuo_types")

    private Integer xiansuoTypes;


    /**
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "xiansuo_file")

    private String xiansuoFile;


    /**
     * 线索内容
     */
    @ColumnInfo(comment="线索内容",type="longtext")
    @TableField(value = "xiansuo_content")

    private String xiansuoContent;


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
	 * 获取：线索编号
	 */
    public String getXiansuoUuidNumber() {
        return xiansuoUuidNumber;
    }
    /**
	 * 设置：线索编号
	 */

    public void setXiansuoUuidNumber(String xiansuoUuidNumber) {
        this.xiansuoUuidNumber = xiansuoUuidNumber;
    }
    /**
	 * 获取：线索标题
	 */
    public String getXiansuoName() {
        return xiansuoName;
    }
    /**
	 * 设置：线索标题
	 */

    public void setXiansuoName(String xiansuoName) {
        this.xiansuoName = xiansuoName;
    }
    /**
	 * 获取：线索发现地址
	 */
    public String getXiansuoAddress() {
        return xiansuoAddress;
    }
    /**
	 * 设置：线索发现地址
	 */

    public void setXiansuoAddress(String xiansuoAddress) {
        this.xiansuoAddress = xiansuoAddress;
    }
    /**
	 * 获取：发现时间
	 */
    public Date getXiansuoTime() {
        return xiansuoTime;
    }
    /**
	 * 设置：发现时间
	 */

    public void setXiansuoTime(Date xiansuoTime) {
        this.xiansuoTime = xiansuoTime;
    }
    /**
	 * 获取：线索等级
	 */
    public Integer getXiansuoDengjiTypes() {
        return xiansuoDengjiTypes;
    }
    /**
	 * 设置：线索等级
	 */

    public void setXiansuoDengjiTypes(Integer xiansuoDengjiTypes) {
        this.xiansuoDengjiTypes = xiansuoDengjiTypes;
    }
    /**
	 * 获取：线索类型
	 */
    public Integer getXiansuoTypes() {
        return xiansuoTypes;
    }
    /**
	 * 设置：线索类型
	 */

    public void setXiansuoTypes(Integer xiansuoTypes) {
        this.xiansuoTypes = xiansuoTypes;
    }
    /**
	 * 获取：附件
	 */
    public String getXiansuoFile() {
        return xiansuoFile;
    }
    /**
	 * 设置：附件
	 */

    public void setXiansuoFile(String xiansuoFile) {
        this.xiansuoFile = xiansuoFile;
    }
    /**
	 * 获取：线索内容
	 */
    public String getXiansuoContent() {
        return xiansuoContent;
    }
    /**
	 * 设置：线索内容
	 */

    public void setXiansuoContent(String xiansuoContent) {
        this.xiansuoContent = xiansuoContent;
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
        return "Xiansuo{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", xiansuoUuidNumber=" + xiansuoUuidNumber +
            ", xiansuoName=" + xiansuoName +
            ", xiansuoAddress=" + xiansuoAddress +
            ", xiansuoTime=" + DateUtil.convertString(xiansuoTime,"yyyy-MM-dd") +
            ", xiansuoDengjiTypes=" + xiansuoDengjiTypes +
            ", xiansuoTypes=" + xiansuoTypes +
            ", xiansuoFile=" + xiansuoFile +
            ", xiansuoContent=" + xiansuoContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
