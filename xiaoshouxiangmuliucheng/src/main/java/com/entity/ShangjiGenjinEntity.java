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
 * 商机跟进
 *
 * @author 
 * @email
 */
@TableName("shangji_genjin")
public class ShangjiGenjinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShangjiGenjinEntity() {

	}

	public ShangjiGenjinEntity(T t) {
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
     * 商机
     */
    @ColumnInfo(comment="商机",type="int(11)")
    @TableField(value = "shangji_id")

    private Integer shangjiId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 商机跟进编号
     */
    @ColumnInfo(comment="商机跟进编号",type="varchar(200)")
    @TableField(value = "shangji_genjin_uuid_number")

    private String shangjiGenjinUuidNumber;


    /**
     * 商机跟进标题
     */
    @ColumnInfo(comment="商机跟进标题",type="varchar(200)")
    @TableField(value = "shangji_genjin_name")

    private String shangjiGenjinName;


    /**
     * 跟进时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="跟进时间",type="timestamp")
    @TableField(value = "shangji_genjin_time")

    private Date shangjiGenjinTime;


    /**
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "shangji_genjin_file")

    private String shangjiGenjinFile;


    /**
     * 商机跟进类型
     */
    @ColumnInfo(comment="商机跟进类型",type="int(11)")
    @TableField(value = "shangji_genjin_types")

    private Integer shangjiGenjinTypes;


    /**
     * 商机跟进详情
     */
    @ColumnInfo(comment="商机跟进详情",type="longtext")
    @TableField(value = "shangji_genjin_content")

    private String shangjiGenjinContent;


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
	 * 获取：商机
	 */
    public Integer getShangjiId() {
        return shangjiId;
    }
    /**
	 * 设置：商机
	 */

    public void setShangjiId(Integer shangjiId) {
        this.shangjiId = shangjiId;
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
	 * 获取：商机跟进编号
	 */
    public String getShangjiGenjinUuidNumber() {
        return shangjiGenjinUuidNumber;
    }
    /**
	 * 设置：商机跟进编号
	 */

    public void setShangjiGenjinUuidNumber(String shangjiGenjinUuidNumber) {
        this.shangjiGenjinUuidNumber = shangjiGenjinUuidNumber;
    }
    /**
	 * 获取：商机跟进标题
	 */
    public String getShangjiGenjinName() {
        return shangjiGenjinName;
    }
    /**
	 * 设置：商机跟进标题
	 */

    public void setShangjiGenjinName(String shangjiGenjinName) {
        this.shangjiGenjinName = shangjiGenjinName;
    }
    /**
	 * 获取：跟进时间
	 */
    public Date getShangjiGenjinTime() {
        return shangjiGenjinTime;
    }
    /**
	 * 设置：跟进时间
	 */

    public void setShangjiGenjinTime(Date shangjiGenjinTime) {
        this.shangjiGenjinTime = shangjiGenjinTime;
    }
    /**
	 * 获取：附件
	 */
    public String getShangjiGenjinFile() {
        return shangjiGenjinFile;
    }
    /**
	 * 设置：附件
	 */

    public void setShangjiGenjinFile(String shangjiGenjinFile) {
        this.shangjiGenjinFile = shangjiGenjinFile;
    }
    /**
	 * 获取：商机跟进类型
	 */
    public Integer getShangjiGenjinTypes() {
        return shangjiGenjinTypes;
    }
    /**
	 * 设置：商机跟进类型
	 */

    public void setShangjiGenjinTypes(Integer shangjiGenjinTypes) {
        this.shangjiGenjinTypes = shangjiGenjinTypes;
    }
    /**
	 * 获取：商机跟进详情
	 */
    public String getShangjiGenjinContent() {
        return shangjiGenjinContent;
    }
    /**
	 * 设置：商机跟进详情
	 */

    public void setShangjiGenjinContent(String shangjiGenjinContent) {
        this.shangjiGenjinContent = shangjiGenjinContent;
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
        return "ShangjiGenjin{" +
            ", id=" + id +
            ", shangjiId=" + shangjiId +
            ", yonghuId=" + yonghuId +
            ", shangjiGenjinUuidNumber=" + shangjiGenjinUuidNumber +
            ", shangjiGenjinName=" + shangjiGenjinName +
            ", shangjiGenjinTime=" + DateUtil.convertString(shangjiGenjinTime,"yyyy-MM-dd") +
            ", shangjiGenjinFile=" + shangjiGenjinFile +
            ", shangjiGenjinTypes=" + shangjiGenjinTypes +
            ", shangjiGenjinContent=" + shangjiGenjinContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
