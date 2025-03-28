package com.entity.vo;

import com.entity.LixiangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 项目立项
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("lixiang")
public class LixiangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 立项编号
     */

    @TableField(value = "lixiang_uuid_number")
    private String lixiangUuidNumber;


    /**
     * 项目名称
     */

    @TableField(value = "lixiang_name")
    private String lixiangName;


    /**
     * 项目类型
     */

    @TableField(value = "lixiang_types")
    private Integer lixiangTypes;


    /**
     * 项目地址
     */

    @TableField(value = "lixiang_address")
    private String lixiangAddress;


    /**
     * 附件
     */

    @TableField(value = "lixiang_file")
    private String lixiangFile;


    /**
     * 立项内容
     */

    @TableField(value = "lixiang_content")
    private String lixiangContent;


    /**
     * 立项时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 立项状态
     */

    @TableField(value = "lixiang_yesno_types")
    private Integer lixiangYesnoTypes;


    /**
     * 审核意见
     */

    @TableField(value = "lixiang_yesno_text")
    private String lixiangYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "lixiang_shenhe_time")
    private Date lixiangShenheTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：立项编号
	 */
    public String getLixiangUuidNumber() {
        return lixiangUuidNumber;
    }


    /**
	 * 获取：立项编号
	 */

    public void setLixiangUuidNumber(String lixiangUuidNumber) {
        this.lixiangUuidNumber = lixiangUuidNumber;
    }
    /**
	 * 设置：项目名称
	 */
    public String getLixiangName() {
        return lixiangName;
    }


    /**
	 * 获取：项目名称
	 */

    public void setLixiangName(String lixiangName) {
        this.lixiangName = lixiangName;
    }
    /**
	 * 设置：项目类型
	 */
    public Integer getLixiangTypes() {
        return lixiangTypes;
    }


    /**
	 * 获取：项目类型
	 */

    public void setLixiangTypes(Integer lixiangTypes) {
        this.lixiangTypes = lixiangTypes;
    }
    /**
	 * 设置：项目地址
	 */
    public String getLixiangAddress() {
        return lixiangAddress;
    }


    /**
	 * 获取：项目地址
	 */

    public void setLixiangAddress(String lixiangAddress) {
        this.lixiangAddress = lixiangAddress;
    }
    /**
	 * 设置：附件
	 */
    public String getLixiangFile() {
        return lixiangFile;
    }


    /**
	 * 获取：附件
	 */

    public void setLixiangFile(String lixiangFile) {
        this.lixiangFile = lixiangFile;
    }
    /**
	 * 设置：立项内容
	 */
    public String getLixiangContent() {
        return lixiangContent;
    }


    /**
	 * 获取：立项内容
	 */

    public void setLixiangContent(String lixiangContent) {
        this.lixiangContent = lixiangContent;
    }
    /**
	 * 设置：立项时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：立项时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：立项状态
	 */
    public Integer getLixiangYesnoTypes() {
        return lixiangYesnoTypes;
    }


    /**
	 * 获取：立项状态
	 */

    public void setLixiangYesnoTypes(Integer lixiangYesnoTypes) {
        this.lixiangYesnoTypes = lixiangYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getLixiangYesnoText() {
        return lixiangYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setLixiangYesnoText(String lixiangYesnoText) {
        this.lixiangYesnoText = lixiangYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getLixiangShenheTime() {
        return lixiangShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setLixiangShenheTime(Date lixiangShenheTime) {
        this.lixiangShenheTime = lixiangShenheTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
