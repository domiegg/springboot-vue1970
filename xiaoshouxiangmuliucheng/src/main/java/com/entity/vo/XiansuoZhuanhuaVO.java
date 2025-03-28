package com.entity.vo;

import com.entity.XiansuoZhuanhuaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 线索转化
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiansuo_zhuanhua")
public class XiansuoZhuanhuaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 线索
     */

    @TableField(value = "xiansuo_id")
    private Integer xiansuoId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 线索转化编号
     */

    @TableField(value = "xiansuo_zhuanhua_uuid_number")
    private String xiansuoZhuanhuaUuidNumber;


    /**
     * 线索转化标题
     */

    @TableField(value = "xiansuo_zhuanhua_name")
    private String xiansuoZhuanhuaName;


    /**
     * 转化时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "xiansuo_zhuanhua_time")
    private Date xiansuoZhuanhuaTime;


    /**
     * 附件
     */

    @TableField(value = "xiansuo_zhuanhua_file")
    private String xiansuoZhuanhuaFile;


    /**
     * 线索转化类型
     */

    @TableField(value = "xiansuo_zhuanhua_types")
    private Integer xiansuoZhuanhuaTypes;


    /**
     * 线索转化内容
     */

    @TableField(value = "xiansuo_zhuanhua_content")
    private String xiansuoZhuanhuaContent;


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
	 * 设置：线索
	 */
    public Integer getXiansuoId() {
        return xiansuoId;
    }


    /**
	 * 获取：线索
	 */

    public void setXiansuoId(Integer xiansuoId) {
        this.xiansuoId = xiansuoId;
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
	 * 设置：线索转化编号
	 */
    public String getXiansuoZhuanhuaUuidNumber() {
        return xiansuoZhuanhuaUuidNumber;
    }


    /**
	 * 获取：线索转化编号
	 */

    public void setXiansuoZhuanhuaUuidNumber(String xiansuoZhuanhuaUuidNumber) {
        this.xiansuoZhuanhuaUuidNumber = xiansuoZhuanhuaUuidNumber;
    }
    /**
	 * 设置：线索转化标题
	 */
    public String getXiansuoZhuanhuaName() {
        return xiansuoZhuanhuaName;
    }


    /**
	 * 获取：线索转化标题
	 */

    public void setXiansuoZhuanhuaName(String xiansuoZhuanhuaName) {
        this.xiansuoZhuanhuaName = xiansuoZhuanhuaName;
    }
    /**
	 * 设置：转化时间
	 */
    public Date getXiansuoZhuanhuaTime() {
        return xiansuoZhuanhuaTime;
    }


    /**
	 * 获取：转化时间
	 */

    public void setXiansuoZhuanhuaTime(Date xiansuoZhuanhuaTime) {
        this.xiansuoZhuanhuaTime = xiansuoZhuanhuaTime;
    }
    /**
	 * 设置：附件
	 */
    public String getXiansuoZhuanhuaFile() {
        return xiansuoZhuanhuaFile;
    }


    /**
	 * 获取：附件
	 */

    public void setXiansuoZhuanhuaFile(String xiansuoZhuanhuaFile) {
        this.xiansuoZhuanhuaFile = xiansuoZhuanhuaFile;
    }
    /**
	 * 设置：线索转化类型
	 */
    public Integer getXiansuoZhuanhuaTypes() {
        return xiansuoZhuanhuaTypes;
    }


    /**
	 * 获取：线索转化类型
	 */

    public void setXiansuoZhuanhuaTypes(Integer xiansuoZhuanhuaTypes) {
        this.xiansuoZhuanhuaTypes = xiansuoZhuanhuaTypes;
    }
    /**
	 * 设置：线索转化内容
	 */
    public String getXiansuoZhuanhuaContent() {
        return xiansuoZhuanhuaContent;
    }


    /**
	 * 获取：线索转化内容
	 */

    public void setXiansuoZhuanhuaContent(String xiansuoZhuanhuaContent) {
        this.xiansuoZhuanhuaContent = xiansuoZhuanhuaContent;
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
