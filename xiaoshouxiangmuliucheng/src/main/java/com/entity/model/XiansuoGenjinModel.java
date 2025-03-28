package com.entity.model;

import com.entity.XiansuoGenjinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 线索跟进
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiansuoGenjinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 线索
     */
    private Integer xiansuoId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 线索跟进编号
     */
    private String xiansuoGenjinUuidNumber;


    /**
     * 线索跟进标题
     */
    private String xiansuoGenjinName;


    /**
     * 跟进时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date xiansuoGenjinTime;


    /**
     * 附件
     */
    private String xiansuoGenjinFile;


    /**
     * 线索跟进类型
     */
    private Integer xiansuoGenjinTypes;


    /**
     * 线索跟进详情
     */
    private String xiansuoGenjinContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
