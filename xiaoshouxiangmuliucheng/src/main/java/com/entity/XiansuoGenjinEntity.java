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
 * 线索跟进
 *
 * @author 
 * @email
 */
@TableName("xiansuo_genjin")
public class XiansuoGenjinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiansuoGenjinEntity() {

	}

	public XiansuoGenjinEntity(T t) {
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
     * 线索
     */
    @ColumnInfo(comment="线索",type="int(11)")
    @TableField(value = "xiansuo_id")

    private Integer xiansuoId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 线索跟进编号
     */
    @ColumnInfo(comment="线索跟进编号",type="varchar(200)")
    @TableField(value = "xiansuo_genjin_uuid_number")

    private String xiansuoGenjinUuidNumber;


    /**
     * 线索跟进标题
     */
    @ColumnInfo(comment="线索跟进标题",type="varchar(200)")
    @TableField(value = "xiansuo_genjin_name")

    private String xiansuoGenjinName;


    /**
     * 跟进时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="跟进时间",type="timestamp")
    @TableField(value = "xiansuo_genjin_time")

    private Date xiansuoGenjinTime;


    /**
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "xiansuo_genjin_file")

    private String xiansuoGenjinFile;


    /**
     * 线索跟进类型
     */
    @ColumnInfo(comment="线索跟进类型",type="int(11)")
    @TableField(value = "xiansuo_genjin_types")

    private Integer xiansuoGenjinTypes;


    /**
     * 线索跟进详情
     */
    @ColumnInfo(comment="线索跟进详情",type="longtext")
    @TableField(value = "xiansuo_genjin_content")

    private String xiansuoGenjinContent;


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
	 * 获取：线索
	 */
    public Integer getXiansuoId() {
        return xiansuoId;
    }
    /**
	 * 设置：线索
	 */

    public void setXiansuoId(Integer xiansuoId) {
        this.xiansuoId = xiansuoId;
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
	 * 获取：线索跟进编号
	 */
    public String getXiansuoGenjinUuidNumber() {
        return xiansuoGenjinUuidNumber;
    }
    /**
	 * 设置：线索跟进编号
	 */

    public void setXiansuoGenjinUuidNumber(String xiansuoGenjinUuidNumber) {
        this.xiansuoGenjinUuidNumber = xiansuoGenjinUuidNumber;
    }
    /**
	 * 获取：线索跟进标题
	 */
    public String getXiansuoGenjinName() {
        return xiansuoGenjinName;
    }
    /**
	 * 设置：线索跟进标题
	 */

    public void setXiansuoGenjinName(String xiansuoGenjinName) {
        this.xiansuoGenjinName = xiansuoGenjinName;
    }
    /**
	 * 获取：跟进时间
	 */
    public Date getXiansuoGenjinTime() {
        return xiansuoGenjinTime;
    }
    /**
	 * 设置：跟进时间
	 */

    public void setXiansuoGenjinTime(Date xiansuoGenjinTime) {
        this.xiansuoGenjinTime = xiansuoGenjinTime;
    }
    /**
	 * 获取：附件
	 */
    public String getXiansuoGenjinFile() {
        return xiansuoGenjinFile;
    }
    /**
	 * 设置：附件
	 */

    public void setXiansuoGenjinFile(String xiansuoGenjinFile) {
        this.xiansuoGenjinFile = xiansuoGenjinFile;
    }
    /**
	 * 获取：线索跟进类型
	 */
    public Integer getXiansuoGenjinTypes() {
        return xiansuoGenjinTypes;
    }
    /**
	 * 设置：线索跟进类型
	 */

    public void setXiansuoGenjinTypes(Integer xiansuoGenjinTypes) {
        this.xiansuoGenjinTypes = xiansuoGenjinTypes;
    }
    /**
	 * 获取：线索跟进详情
	 */
    public String getXiansuoGenjinContent() {
        return xiansuoGenjinContent;
    }
    /**
	 * 设置：线索跟进详情
	 */

    public void setXiansuoGenjinContent(String xiansuoGenjinContent) {
        this.xiansuoGenjinContent = xiansuoGenjinContent;
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
        return "XiansuoGenjin{" +
            ", id=" + id +
            ", xiansuoId=" + xiansuoId +
            ", yonghuId=" + yonghuId +
            ", xiansuoGenjinUuidNumber=" + xiansuoGenjinUuidNumber +
            ", xiansuoGenjinName=" + xiansuoGenjinName +
            ", xiansuoGenjinTime=" + DateUtil.convertString(xiansuoGenjinTime,"yyyy-MM-dd") +
            ", xiansuoGenjinFile=" + xiansuoGenjinFile +
            ", xiansuoGenjinTypes=" + xiansuoGenjinTypes +
            ", xiansuoGenjinContent=" + xiansuoGenjinContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
