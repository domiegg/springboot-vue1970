package com.entity.vo;

import com.entity.ZhaobiaoToubiaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 投标
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhaobiao_toubiao")
public class ZhaobiaoToubiaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 招标
     */

    @TableField(value = "zhaobiao_id")
    private Integer zhaobiaoId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 投标编号
     */

    @TableField(value = "zhaobiao_toubiao_uuid_number")
    private String zhaobiaoToubiaoUuidNumber;


    /**
     * 投标文件
     */

    @TableField(value = "zhaobiao_toubiao_file")
    private String zhaobiaoToubiaoFile;


    /**
     * 投标时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "zhaobiao_toubiao_time")
    private Date zhaobiaoToubiaoTime;


    /**
     * 投标备注
     */

    @TableField(value = "zhaobiao_toubiao_content")
    private String zhaobiaoToubiaoContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 投标状态
     */

    @TableField(value = "zhaobiao_toubiao_yesno_types")
    private Integer zhaobiaoToubiaoYesnoTypes;


    /**
     * 投标评分
     */

    @TableField(value = "zhaobiao_toubiao_pingfen")
    private Double zhaobiaoToubiaoPingfen;


    /**
     * 投标回复
     */

    @TableField(value = "zhaobiao_toubiao_yesno_text")
    private String zhaobiaoToubiaoYesnoText;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "zhaobiao_toubiao_shenhe_time")
    private Date zhaobiaoToubiaoShenheTime;


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
	 * 设置：招标
	 */
    public Integer getZhaobiaoId() {
        return zhaobiaoId;
    }


    /**
	 * 获取：招标
	 */

    public void setZhaobiaoId(Integer zhaobiaoId) {
        this.zhaobiaoId = zhaobiaoId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：投标编号
	 */
    public String getZhaobiaoToubiaoUuidNumber() {
        return zhaobiaoToubiaoUuidNumber;
    }


    /**
	 * 获取：投标编号
	 */

    public void setZhaobiaoToubiaoUuidNumber(String zhaobiaoToubiaoUuidNumber) {
        this.zhaobiaoToubiaoUuidNumber = zhaobiaoToubiaoUuidNumber;
    }
    /**
	 * 设置：投标文件
	 */
    public String getZhaobiaoToubiaoFile() {
        return zhaobiaoToubiaoFile;
    }


    /**
	 * 获取：投标文件
	 */

    public void setZhaobiaoToubiaoFile(String zhaobiaoToubiaoFile) {
        this.zhaobiaoToubiaoFile = zhaobiaoToubiaoFile;
    }
    /**
	 * 设置：投标时间
	 */
    public Date getZhaobiaoToubiaoTime() {
        return zhaobiaoToubiaoTime;
    }


    /**
	 * 获取：投标时间
	 */

    public void setZhaobiaoToubiaoTime(Date zhaobiaoToubiaoTime) {
        this.zhaobiaoToubiaoTime = zhaobiaoToubiaoTime;
    }
    /**
	 * 设置：投标备注
	 */
    public String getZhaobiaoToubiaoContent() {
        return zhaobiaoToubiaoContent;
    }


    /**
	 * 获取：投标备注
	 */

    public void setZhaobiaoToubiaoContent(String zhaobiaoToubiaoContent) {
        this.zhaobiaoToubiaoContent = zhaobiaoToubiaoContent;
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
	 * 设置：投标状态
	 */
    public Integer getZhaobiaoToubiaoYesnoTypes() {
        return zhaobiaoToubiaoYesnoTypes;
    }


    /**
	 * 获取：投标状态
	 */

    public void setZhaobiaoToubiaoYesnoTypes(Integer zhaobiaoToubiaoYesnoTypes) {
        this.zhaobiaoToubiaoYesnoTypes = zhaobiaoToubiaoYesnoTypes;
    }
    /**
	 * 设置：投标评分
	 */
    public Double getZhaobiaoToubiaoPingfen() {
        return zhaobiaoToubiaoPingfen;
    }


    /**
	 * 获取：投标评分
	 */

    public void setZhaobiaoToubiaoPingfen(Double zhaobiaoToubiaoPingfen) {
        this.zhaobiaoToubiaoPingfen = zhaobiaoToubiaoPingfen;
    }
    /**
	 * 设置：投标回复
	 */
    public String getZhaobiaoToubiaoYesnoText() {
        return zhaobiaoToubiaoYesnoText;
    }


    /**
	 * 获取：投标回复
	 */

    public void setZhaobiaoToubiaoYesnoText(String zhaobiaoToubiaoYesnoText) {
        this.zhaobiaoToubiaoYesnoText = zhaobiaoToubiaoYesnoText;
    }
    /**
	 * 设置：回复时间
	 */
    public Date getZhaobiaoToubiaoShenheTime() {
        return zhaobiaoToubiaoShenheTime;
    }


    /**
	 * 获取：回复时间
	 */

    public void setZhaobiaoToubiaoShenheTime(Date zhaobiaoToubiaoShenheTime) {
        this.zhaobiaoToubiaoShenheTime = zhaobiaoToubiaoShenheTime;
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
