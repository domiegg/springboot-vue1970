package com.entity.vo;

import com.entity.ShangjiZhuanhuaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 商机转化
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shangji_zhuanhua")
public class ShangjiZhuanhuaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 商机
     */

    @TableField(value = "shangji_id")
    private Integer shangjiId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 商机转化编号
     */

    @TableField(value = "shangji_zhuanhua_uuid_number")
    private String shangjiZhuanhuaUuidNumber;


    /**
     * 商机转化标题
     */

    @TableField(value = "shangji_zhuanhua_name")
    private String shangjiZhuanhuaName;


    /**
     * 转化时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shangji_zhuanhua_time")
    private Date shangjiZhuanhuaTime;


    /**
     * 附件
     */

    @TableField(value = "shangji_zhuanhua_file")
    private String shangjiZhuanhuaFile;


    /**
     * 商机转化类型
     */

    @TableField(value = "shangji_zhuanhua_types")
    private Integer shangjiZhuanhuaTypes;


    /**
     * 商机转化内容
     */

    @TableField(value = "shangji_zhuanhua_content")
    private String shangjiZhuanhuaContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


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
	 * 设置：商机
	 */
    public Integer getShangjiId() {
        return shangjiId;
    }


    /**
	 * 获取：商机
	 */

    public void setShangjiId(Integer shangjiId) {
        this.shangjiId = shangjiId;
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
	 * 设置：商机转化编号
	 */
    public String getShangjiZhuanhuaUuidNumber() {
        return shangjiZhuanhuaUuidNumber;
    }


    /**
	 * 获取：商机转化编号
	 */

    public void setShangjiZhuanhuaUuidNumber(String shangjiZhuanhuaUuidNumber) {
        this.shangjiZhuanhuaUuidNumber = shangjiZhuanhuaUuidNumber;
    }
    /**
	 * 设置：商机转化标题
	 */
    public String getShangjiZhuanhuaName() {
        return shangjiZhuanhuaName;
    }


    /**
	 * 获取：商机转化标题
	 */

    public void setShangjiZhuanhuaName(String shangjiZhuanhuaName) {
        this.shangjiZhuanhuaName = shangjiZhuanhuaName;
    }
    /**
	 * 设置：转化时间
	 */
    public Date getShangjiZhuanhuaTime() {
        return shangjiZhuanhuaTime;
    }


    /**
	 * 获取：转化时间
	 */

    public void setShangjiZhuanhuaTime(Date shangjiZhuanhuaTime) {
        this.shangjiZhuanhuaTime = shangjiZhuanhuaTime;
    }
    /**
	 * 设置：附件
	 */
    public String getShangjiZhuanhuaFile() {
        return shangjiZhuanhuaFile;
    }


    /**
	 * 获取：附件
	 */

    public void setShangjiZhuanhuaFile(String shangjiZhuanhuaFile) {
        this.shangjiZhuanhuaFile = shangjiZhuanhuaFile;
    }
    /**
	 * 设置：商机转化类型
	 */
    public Integer getShangjiZhuanhuaTypes() {
        return shangjiZhuanhuaTypes;
    }


    /**
	 * 获取：商机转化类型
	 */

    public void setShangjiZhuanhuaTypes(Integer shangjiZhuanhuaTypes) {
        this.shangjiZhuanhuaTypes = shangjiZhuanhuaTypes;
    }
    /**
	 * 设置：商机转化内容
	 */
    public String getShangjiZhuanhuaContent() {
        return shangjiZhuanhuaContent;
    }


    /**
	 * 获取：商机转化内容
	 */

    public void setShangjiZhuanhuaContent(String shangjiZhuanhuaContent) {
        this.shangjiZhuanhuaContent = shangjiZhuanhuaContent;
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
