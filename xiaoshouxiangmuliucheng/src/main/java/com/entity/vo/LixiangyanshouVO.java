package com.entity.vo;

import com.entity.LixiangyanshouEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 项目验收
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("lixiangyanshou")
public class LixiangyanshouVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 立项项目
     */

    @TableField(value = "lixiang_id")
    private Integer lixiangId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 项目验收编号
     */

    @TableField(value = "lixiangyanshou_uuid_number")
    private String lixiangyanshouUuidNumber;


    /**
     * 验收标题
     */

    @TableField(value = "lixiangyanshou_name")
    private String lixiangyanshouName;


    /**
     * 项目验收附件
     */

    @TableField(value = "lixiangyanshou_file")
    private String lixiangyanshouFile;


    /**
     * 验收地点
     */

    @TableField(value = "lixiangyanshou_address")
    private String lixiangyanshouAddress;


    /**
     * 验收时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "lixiangyanshou_time")
    private Date lixiangyanshouTime;


    /**
     * 验收内容
     */

    @TableField(value = "lixiangyanshou_content")
    private String lixiangyanshouContent;


    /**
     * 验收结果
     */

    @TableField(value = "lixiangyanshou_jieguo")
    private String lixiangyanshouJieguo;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 审核状态
     */

    @TableField(value = "lixiangyanshou_yesno_types")
    private Integer lixiangyanshouYesnoTypes;


    /**
     * 审核意见
     */

    @TableField(value = "lixiangyanshou_yesno_text")
    private String lixiangyanshouYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "lixiangyanshou_shenhe_time")
    private Date lixiangyanshouShenheTime;


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
	 * 设置：立项项目
	 */
    public Integer getLixiangId() {
        return lixiangId;
    }


    /**
	 * 获取：立项项目
	 */

    public void setLixiangId(Integer lixiangId) {
        this.lixiangId = lixiangId;
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
	 * 设置：项目验收编号
	 */
    public String getLixiangyanshouUuidNumber() {
        return lixiangyanshouUuidNumber;
    }


    /**
	 * 获取：项目验收编号
	 */

    public void setLixiangyanshouUuidNumber(String lixiangyanshouUuidNumber) {
        this.lixiangyanshouUuidNumber = lixiangyanshouUuidNumber;
    }
    /**
	 * 设置：验收标题
	 */
    public String getLixiangyanshouName() {
        return lixiangyanshouName;
    }


    /**
	 * 获取：验收标题
	 */

    public void setLixiangyanshouName(String lixiangyanshouName) {
        this.lixiangyanshouName = lixiangyanshouName;
    }
    /**
	 * 设置：项目验收附件
	 */
    public String getLixiangyanshouFile() {
        return lixiangyanshouFile;
    }


    /**
	 * 获取：项目验收附件
	 */

    public void setLixiangyanshouFile(String lixiangyanshouFile) {
        this.lixiangyanshouFile = lixiangyanshouFile;
    }
    /**
	 * 设置：验收地点
	 */
    public String getLixiangyanshouAddress() {
        return lixiangyanshouAddress;
    }


    /**
	 * 获取：验收地点
	 */

    public void setLixiangyanshouAddress(String lixiangyanshouAddress) {
        this.lixiangyanshouAddress = lixiangyanshouAddress;
    }
    /**
	 * 设置：验收时间
	 */
    public Date getLixiangyanshouTime() {
        return lixiangyanshouTime;
    }


    /**
	 * 获取：验收时间
	 */

    public void setLixiangyanshouTime(Date lixiangyanshouTime) {
        this.lixiangyanshouTime = lixiangyanshouTime;
    }
    /**
	 * 设置：验收内容
	 */
    public String getLixiangyanshouContent() {
        return lixiangyanshouContent;
    }


    /**
	 * 获取：验收内容
	 */

    public void setLixiangyanshouContent(String lixiangyanshouContent) {
        this.lixiangyanshouContent = lixiangyanshouContent;
    }
    /**
	 * 设置：验收结果
	 */
    public String getLixiangyanshouJieguo() {
        return lixiangyanshouJieguo;
    }


    /**
	 * 获取：验收结果
	 */

    public void setLixiangyanshouJieguo(String lixiangyanshouJieguo) {
        this.lixiangyanshouJieguo = lixiangyanshouJieguo;
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
	 * 设置：审核状态
	 */
    public Integer getLixiangyanshouYesnoTypes() {
        return lixiangyanshouYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setLixiangyanshouYesnoTypes(Integer lixiangyanshouYesnoTypes) {
        this.lixiangyanshouYesnoTypes = lixiangyanshouYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getLixiangyanshouYesnoText() {
        return lixiangyanshouYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setLixiangyanshouYesnoText(String lixiangyanshouYesnoText) {
        this.lixiangyanshouYesnoText = lixiangyanshouYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getLixiangyanshouShenheTime() {
        return lixiangyanshouShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setLixiangyanshouShenheTime(Date lixiangyanshouShenheTime) {
        this.lixiangyanshouShenheTime = lixiangyanshouShenheTime;
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
