package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.YonghuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 用户
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("yonghu")
public class YonghuView extends YonghuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 性别的值
	*/
	@ColumnInfo(comment="性别的字典表值",type="varchar(200)")
	private String sexValue;
	/**
	* 账户状态的值
	*/
	@ColumnInfo(comment="账户状态的字典表值",type="varchar(200)")
	private String jinyongValue;

	//级联表 企业
		/**
		* 企业名称
		*/

		@ColumnInfo(comment="企业名称",type="varchar(200)")
		private String qiyeName;
		/**
		* 负责人
		*/

		@ColumnInfo(comment="负责人",type="varchar(200)")
		private String qiyeFuzeren;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String qiyePhone;
		/**
		* 邮箱
		*/

		@ColumnInfo(comment="邮箱",type="varchar(200)")
		private String qiyeEmail;
		/**
		* 企业logo
		*/

		@ColumnInfo(comment="企业logo",type="varchar(200)")
		private String qiyeLogoPhoto;
		/**
		* 营业执照展示
		*/

		@ColumnInfo(comment="营业执照展示",type="varchar(200)")
		private String qiyePhoto;
		/**
		* 企业介绍
		*/

		@ColumnInfo(comment="企业介绍",type="longtext")
		private String qiyeContent;

	//重复字段


	public YonghuView() {

	}

	public YonghuView(YonghuEntity yonghuEntity) {
		try {
			BeanUtils.copyProperties(this, yonghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 性别的值
	*/
	public String getSexValue() {
		return sexValue;
	}
	/**
	* 设置： 性别的值
	*/
	public void setSexValue(String sexValue) {
		this.sexValue = sexValue;
	}
	//当前表的
	/**
	* 获取： 账户状态的值
	*/
	public String getJinyongValue() {
		return jinyongValue;
	}
	/**
	* 设置： 账户状态的值
	*/
	public void setJinyongValue(String jinyongValue) {
		this.jinyongValue = jinyongValue;
	}


	//级联表的get和set 企业

		/**
		* 获取： 企业名称
		*/
		public String getQiyeName() {
			return qiyeName;
		}
		/**
		* 设置： 企业名称
		*/
		public void setQiyeName(String qiyeName) {
			this.qiyeName = qiyeName;
		}

		/**
		* 获取： 负责人
		*/
		public String getQiyeFuzeren() {
			return qiyeFuzeren;
		}
		/**
		* 设置： 负责人
		*/
		public void setQiyeFuzeren(String qiyeFuzeren) {
			this.qiyeFuzeren = qiyeFuzeren;
		}

		/**
		* 获取： 联系方式
		*/
		public String getQiyePhone() {
			return qiyePhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setQiyePhone(String qiyePhone) {
			this.qiyePhone = qiyePhone;
		}

		/**
		* 获取： 邮箱
		*/
		public String getQiyeEmail() {
			return qiyeEmail;
		}
		/**
		* 设置： 邮箱
		*/
		public void setQiyeEmail(String qiyeEmail) {
			this.qiyeEmail = qiyeEmail;
		}

		/**
		* 获取： 企业logo
		*/
		public String getQiyeLogoPhoto() {
			return qiyeLogoPhoto;
		}
		/**
		* 设置： 企业logo
		*/
		public void setQiyeLogoPhoto(String qiyeLogoPhoto) {
			this.qiyeLogoPhoto = qiyeLogoPhoto;
		}

		/**
		* 获取： 营业执照展示
		*/
		public String getQiyePhoto() {
			return qiyePhoto;
		}
		/**
		* 设置： 营业执照展示
		*/
		public void setQiyePhoto(String qiyePhoto) {
			this.qiyePhoto = qiyePhoto;
		}

		/**
		* 获取： 企业介绍
		*/
		public String getQiyeContent() {
			return qiyeContent;
		}
		/**
		* 设置： 企业介绍
		*/
		public void setQiyeContent(String qiyeContent) {
			this.qiyeContent = qiyeContent;
		}

	//重复字段

	@Override
	public String toString() {
		return "YonghuView{" +
			", sexValue=" + sexValue +
			", jinyongValue=" + jinyongValue +
			", qiyeName=" + qiyeName +
			", qiyeFuzeren=" + qiyeFuzeren +
			", qiyePhone=" + qiyePhone +
			", qiyeEmail=" + qiyeEmail +
			", qiyeLogoPhoto=" + qiyeLogoPhoto +
			", qiyePhoto=" + qiyePhoto +
			", qiyeContent=" + qiyeContent +
			"} " + super.toString();
	}
}
