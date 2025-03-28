package com.entity.vo;

import com.entity.ZhaobiaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 招标
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhaobiao")
public class ZhaobiaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 企业
     */

    @TableField(value = "qiye_id")
    private Integer qiyeId;


    /**
     * 招标编号
     */

    @TableField(value = "zhaobiao_uuid_number")
    private String zhaobiaoUuidNumber;


    /**
     * 招标标题
     */

    @TableField(value = "zhaobiao_name")
    private String zhaobiaoName;


    /**
     * 招标地点
     */

    @TableField(value = "zhaobiao_address")
    private String zhaobiaoAddress;


    /**
     * 招标时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "zhaobiao_time")
    private Date zhaobiaoTime;


    /**
     * 招标类型
     */

    @TableField(value = "zhaobiao_types")
    private Integer zhaobiaoTypes;


    /**
     * 附件
     */

    @TableField(value = "zhaobiao_file")
    private String zhaobiaoFile;


    /**
     * 招标介绍
     */

    @TableField(value = "zhaobiao_content")
    private String zhaobiaoContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：企业
	 */
    public Integer getQiyeId() {
        return qiyeId;
    }


    /**
	 * 获取：企业
	 */

    public void setQiyeId(Integer qiyeId) {
        this.qiyeId = qiyeId;
    }
    /**
	 * 设置：招标编号
	 */
    public String getZhaobiaoUuidNumber() {
        return zhaobiaoUuidNumber;
    }


    /**
	 * 获取：招标编号
	 */

    public void setZhaobiaoUuidNumber(String zhaobiaoUuidNumber) {
        this.zhaobiaoUuidNumber = zhaobiaoUuidNumber;
    }
    /**
	 * 设置：招标标题
	 */
    public String getZhaobiaoName() {
        return zhaobiaoName;
    }


    /**
	 * 获取：招标标题
	 */

    public void setZhaobiaoName(String zhaobiaoName) {
        this.zhaobiaoName = zhaobiaoName;
    }
    /**
	 * 设置：招标地点
	 */
    public String getZhaobiaoAddress() {
        return zhaobiaoAddress;
    }


    /**
	 * 获取：招标地点
	 */

    public void setZhaobiaoAddress(String zhaobiaoAddress) {
        this.zhaobiaoAddress = zhaobiaoAddress;
    }
    /**
	 * 设置：招标时间
	 */
    public Date getZhaobiaoTime() {
        return zhaobiaoTime;
    }


    /**
	 * 获取：招标时间
	 */

    public void setZhaobiaoTime(Date zhaobiaoTime) {
        this.zhaobiaoTime = zhaobiaoTime;
    }
    /**
	 * 设置：招标类型
	 */
    public Integer getZhaobiaoTypes() {
        return zhaobiaoTypes;
    }


    /**
	 * 获取：招标类型
	 */

    public void setZhaobiaoTypes(Integer zhaobiaoTypes) {
        this.zhaobiaoTypes = zhaobiaoTypes;
    }
    /**
	 * 设置：附件
	 */
    public String getZhaobiaoFile() {
        return zhaobiaoFile;
    }


    /**
	 * 获取：附件
	 */

    public void setZhaobiaoFile(String zhaobiaoFile) {
        this.zhaobiaoFile = zhaobiaoFile;
    }
    /**
	 * 设置：招标介绍
	 */
    public String getZhaobiaoContent() {
        return zhaobiaoContent;
    }


    /**
	 * 获取：招标介绍
	 */

    public void setZhaobiaoContent(String zhaobiaoContent) {
        this.zhaobiaoContent = zhaobiaoContent;
    }
    /**
	 * 设置：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：上传时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
