package com.entity.vo;

import com.entity.ShangjiGenjinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 商机跟进
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shangji_genjin")
public class ShangjiGenjinVO implements Serializable {
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
     * 商机跟进编号
     */

    @TableField(value = "shangji_genjin_uuid_number")
    private String shangjiGenjinUuidNumber;


    /**
     * 商机跟进标题
     */

    @TableField(value = "shangji_genjin_name")
    private String shangjiGenjinName;


    /**
     * 跟进时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shangji_genjin_time")
    private Date shangjiGenjinTime;


    /**
     * 附件
     */

    @TableField(value = "shangji_genjin_file")
    private String shangjiGenjinFile;


    /**
     * 商机跟进类型
     */

    @TableField(value = "shangji_genjin_types")
    private Integer shangjiGenjinTypes;


    /**
     * 商机跟进详情
     */

    @TableField(value = "shangji_genjin_content")
    private String shangjiGenjinContent;


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
	 * 设置：商机跟进编号
	 */
    public String getShangjiGenjinUuidNumber() {
        return shangjiGenjinUuidNumber;
    }


    /**
	 * 获取：商机跟进编号
	 */

    public void setShangjiGenjinUuidNumber(String shangjiGenjinUuidNumber) {
        this.shangjiGenjinUuidNumber = shangjiGenjinUuidNumber;
    }
    /**
	 * 设置：商机跟进标题
	 */
    public String getShangjiGenjinName() {
        return shangjiGenjinName;
    }


    /**
	 * 获取：商机跟进标题
	 */

    public void setShangjiGenjinName(String shangjiGenjinName) {
        this.shangjiGenjinName = shangjiGenjinName;
    }
    /**
	 * 设置：跟进时间
	 */
    public Date getShangjiGenjinTime() {
        return shangjiGenjinTime;
    }


    /**
	 * 获取：跟进时间
	 */

    public void setShangjiGenjinTime(Date shangjiGenjinTime) {
        this.shangjiGenjinTime = shangjiGenjinTime;
    }
    /**
	 * 设置：附件
	 */
    public String getShangjiGenjinFile() {
        return shangjiGenjinFile;
    }


    /**
	 * 获取：附件
	 */

    public void setShangjiGenjinFile(String shangjiGenjinFile) {
        this.shangjiGenjinFile = shangjiGenjinFile;
    }
    /**
	 * 设置：商机跟进类型
	 */
    public Integer getShangjiGenjinTypes() {
        return shangjiGenjinTypes;
    }


    /**
	 * 获取：商机跟进类型
	 */

    public void setShangjiGenjinTypes(Integer shangjiGenjinTypes) {
        this.shangjiGenjinTypes = shangjiGenjinTypes;
    }
    /**
	 * 设置：商机跟进详情
	 */
    public String getShangjiGenjinContent() {
        return shangjiGenjinContent;
    }


    /**
	 * 获取：商机跟进详情
	 */

    public void setShangjiGenjinContent(String shangjiGenjinContent) {
        this.shangjiGenjinContent = shangjiGenjinContent;
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
