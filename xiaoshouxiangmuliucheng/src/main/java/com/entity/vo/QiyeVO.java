package com.entity.vo;

import com.entity.QiyeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 企业
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qiye")
public class QiyeVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 企业名称
     */

    @TableField(value = "qiye_name")
    private String qiyeName;


    /**
     * 负责人
     */

    @TableField(value = "qiye_fuzeren")
    private String qiyeFuzeren;


    /**
     * 联系方式
     */

    @TableField(value = "qiye_phone")
    private String qiyePhone;


    /**
     * 邮箱
     */

    @TableField(value = "qiye_email")
    private String qiyeEmail;


    /**
     * 企业logo
     */

    @TableField(value = "qiye_logo_photo")
    private String qiyeLogoPhoto;


    /**
     * 营业执照展示
     */

    @TableField(value = "qiye_photo")
    private String qiyePhoto;


    /**
     * 企业介绍
     */

    @TableField(value = "qiye_content")
    private String qiyeContent;


    /**
     * 账户状态
     */

    @TableField(value = "jinyong_types")
    private Integer jinyongTypes;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：企业名称
	 */
    public String getQiyeName() {
        return qiyeName;
    }


    /**
	 * 获取：企业名称
	 */

    public void setQiyeName(String qiyeName) {
        this.qiyeName = qiyeName;
    }
    /**
	 * 设置：负责人
	 */
    public String getQiyeFuzeren() {
        return qiyeFuzeren;
    }


    /**
	 * 获取：负责人
	 */

    public void setQiyeFuzeren(String qiyeFuzeren) {
        this.qiyeFuzeren = qiyeFuzeren;
    }
    /**
	 * 设置：联系方式
	 */
    public String getQiyePhone() {
        return qiyePhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setQiyePhone(String qiyePhone) {
        this.qiyePhone = qiyePhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getQiyeEmail() {
        return qiyeEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setQiyeEmail(String qiyeEmail) {
        this.qiyeEmail = qiyeEmail;
    }
    /**
	 * 设置：企业logo
	 */
    public String getQiyeLogoPhoto() {
        return qiyeLogoPhoto;
    }


    /**
	 * 获取：企业logo
	 */

    public void setQiyeLogoPhoto(String qiyeLogoPhoto) {
        this.qiyeLogoPhoto = qiyeLogoPhoto;
    }
    /**
	 * 设置：营业执照展示
	 */
    public String getQiyePhoto() {
        return qiyePhoto;
    }


    /**
	 * 获取：营业执照展示
	 */

    public void setQiyePhoto(String qiyePhoto) {
        this.qiyePhoto = qiyePhoto;
    }
    /**
	 * 设置：企业介绍
	 */
    public String getQiyeContent() {
        return qiyeContent;
    }


    /**
	 * 获取：企业介绍
	 */

    public void setQiyeContent(String qiyeContent) {
        this.qiyeContent = qiyeContent;
    }
    /**
	 * 设置：账户状态
	 */
    public Integer getJinyongTypes() {
        return jinyongTypes;
    }


    /**
	 * 获取：账户状态
	 */

    public void setJinyongTypes(Integer jinyongTypes) {
        this.jinyongTypes = jinyongTypes;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
