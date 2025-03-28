package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.LixiangyanshouEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 项目验收
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("lixiangyanshou")
public class LixiangyanshouView extends LixiangyanshouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 审核状态的值
	*/
	@ColumnInfo(comment="审核状态的字典表值",type="varchar(200)")
	private String lixiangyanshouYesnoValue;

	//级联表 项目立项
					 
		/**
		* 项目立项 的 用户
		*/
		@ColumnInfo(comment="用户",type="int(11)")
		private Integer lixiangYonghuId;
		/**
		* 立项编号
		*/

		@ColumnInfo(comment="立项编号",type="varchar(200)")
		private String lixiangUuidNumber;
		/**
		* 项目名称
		*/

		@ColumnInfo(comment="项目名称",type="varchar(200)")
		private String lixiangName;
		/**
		* 项目类型
		*/
		@ColumnInfo(comment="项目类型",type="int(11)")
		private Integer lixiangTypes;
			/**
			* 项目类型的值
			*/
			@ColumnInfo(comment="项目类型的字典表值",type="varchar(200)")
			private String lixiangValue;
		/**
		* 项目地址
		*/

		@ColumnInfo(comment="项目地址",type="varchar(200)")
		private String lixiangAddress;
		/**
		* 附件
		*/

		@ColumnInfo(comment="附件",type="varchar(200)")
		private String lixiangFile;
		/**
		* 立项内容
		*/

		@ColumnInfo(comment="立项内容",type="longtext")
		private String lixiangContent;
		/**
		* 立项状态
		*/
		@ColumnInfo(comment="立项状态",type="int(11)")
		private Integer lixiangYesnoTypes;
			/**
			* 立项状态的值
			*/
			@ColumnInfo(comment="立项状态的字典表值",type="varchar(200)")
			private String lixiangYesnoValue;
		/**
		* 审核意见
		*/

		@ColumnInfo(comment="审核意见",type="longtext")
		private String lixiangYesnoText;
		/**
		* 审核时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="审核时间",type="timestamp")
		private Date lixiangShenheTime;
	//级联表 用户
					 
		/**
		* 用户 的 企业
		*/
		@ColumnInfo(comment="企业",type="int(11)")
		private Integer yonghuQiyeId;
		/**
		* 用户编号
		*/

		@ColumnInfo(comment="用户编号",type="varchar(200)")
		private String yonghuUuidNumber;
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 账户状态
		*/
		@ColumnInfo(comment="账户状态",type="int(11)")
		private Integer jinyongTypes;
			/**
			* 账户状态的值
			*/
			@ColumnInfo(comment="账户状态的字典表值",type="varchar(200)")
			private String jinyongValue;



	public LixiangyanshouView() {

	}

	public LixiangyanshouView(LixiangyanshouEntity lixiangyanshouEntity) {
		try {
			BeanUtils.copyProperties(this, lixiangyanshouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 审核状态的值
	*/
	public String getLixiangyanshouYesnoValue() {
		return lixiangyanshouYesnoValue;
	}
	/**
	* 设置： 审核状态的值
	*/
	public void setLixiangyanshouYesnoValue(String lixiangyanshouYesnoValue) {
		this.lixiangyanshouYesnoValue = lixiangyanshouYesnoValue;
	}


	//级联表的get和set 项目立项
		/**
		* 获取：项目立项 的 用户
		*/
		public Integer getLixiangYonghuId() {
			return lixiangYonghuId;
		}
		/**
		* 设置：项目立项 的 用户
		*/
		public void setLixiangYonghuId(Integer lixiangYonghuId) {
			this.lixiangYonghuId = lixiangYonghuId;
		}

		/**
		* 获取： 立项编号
		*/
		public String getLixiangUuidNumber() {
			return lixiangUuidNumber;
		}
		/**
		* 设置： 立项编号
		*/
		public void setLixiangUuidNumber(String lixiangUuidNumber) {
			this.lixiangUuidNumber = lixiangUuidNumber;
		}

		/**
		* 获取： 项目名称
		*/
		public String getLixiangName() {
			return lixiangName;
		}
		/**
		* 设置： 项目名称
		*/
		public void setLixiangName(String lixiangName) {
			this.lixiangName = lixiangName;
		}
		/**
		* 获取： 项目类型
		*/
		public Integer getLixiangTypes() {
			return lixiangTypes;
		}
		/**
		* 设置： 项目类型
		*/
		public void setLixiangTypes(Integer lixiangTypes) {
			this.lixiangTypes = lixiangTypes;
		}


			/**
			* 获取： 项目类型的值
			*/
			public String getLixiangValue() {
				return lixiangValue;
			}
			/**
			* 设置： 项目类型的值
			*/
			public void setLixiangValue(String lixiangValue) {
				this.lixiangValue = lixiangValue;
			}

		/**
		* 获取： 项目地址
		*/
		public String getLixiangAddress() {
			return lixiangAddress;
		}
		/**
		* 设置： 项目地址
		*/
		public void setLixiangAddress(String lixiangAddress) {
			this.lixiangAddress = lixiangAddress;
		}

		/**
		* 获取： 附件
		*/
		public String getLixiangFile() {
			return lixiangFile;
		}
		/**
		* 设置： 附件
		*/
		public void setLixiangFile(String lixiangFile) {
			this.lixiangFile = lixiangFile;
		}

		/**
		* 获取： 立项内容
		*/
		public String getLixiangContent() {
			return lixiangContent;
		}
		/**
		* 设置： 立项内容
		*/
		public void setLixiangContent(String lixiangContent) {
			this.lixiangContent = lixiangContent;
		}
		/**
		* 获取： 立项状态
		*/
		public Integer getLixiangYesnoTypes() {
			return lixiangYesnoTypes;
		}
		/**
		* 设置： 立项状态
		*/
		public void setLixiangYesnoTypes(Integer lixiangYesnoTypes) {
			this.lixiangYesnoTypes = lixiangYesnoTypes;
		}


			/**
			* 获取： 立项状态的值
			*/
			public String getLixiangYesnoValue() {
				return lixiangYesnoValue;
			}
			/**
			* 设置： 立项状态的值
			*/
			public void setLixiangYesnoValue(String lixiangYesnoValue) {
				this.lixiangYesnoValue = lixiangYesnoValue;
			}

		/**
		* 获取： 审核意见
		*/
		public String getLixiangYesnoText() {
			return lixiangYesnoText;
		}
		/**
		* 设置： 审核意见
		*/
		public void setLixiangYesnoText(String lixiangYesnoText) {
			this.lixiangYesnoText = lixiangYesnoText;
		}

		/**
		* 获取： 审核时间
		*/
		public Date getLixiangShenheTime() {
			return lixiangShenheTime;
		}
		/**
		* 设置： 审核时间
		*/
		public void setLixiangShenheTime(Date lixiangShenheTime) {
			this.lixiangShenheTime = lixiangShenheTime;
		}
	//级联表的get和set 用户
		/**
		* 获取：用户 的 企业
		*/
		public Integer getYonghuQiyeId() {
			return yonghuQiyeId;
		}
		/**
		* 设置：用户 的 企业
		*/
		public void setYonghuQiyeId(Integer yonghuQiyeId) {
			this.yonghuQiyeId = yonghuQiyeId;
		}

		/**
		* 获取： 用户编号
		*/
		public String getYonghuUuidNumber() {
			return yonghuUuidNumber;
		}
		/**
		* 设置： 用户编号
		*/
		public void setYonghuUuidNumber(String yonghuUuidNumber) {
			this.yonghuUuidNumber = yonghuUuidNumber;
		}

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}
		/**
		* 获取： 账户状态
		*/
		public Integer getJinyongTypes() {
			return jinyongTypes;
		}
		/**
		* 设置： 账户状态
		*/
		public void setJinyongTypes(Integer jinyongTypes) {
			this.jinyongTypes = jinyongTypes;
		}


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


	@Override
	public String toString() {
		return "LixiangyanshouView{" +
			", lixiangyanshouYesnoValue=" + lixiangyanshouYesnoValue +
			", lixiangUuidNumber=" + lixiangUuidNumber +
			", lixiangName=" + lixiangName +
			", lixiangAddress=" + lixiangAddress +
			", lixiangFile=" + lixiangFile +
			", lixiangContent=" + lixiangContent +
			", lixiangYesnoText=" + lixiangYesnoText +
			", lixiangShenheTime=" + DateUtil.convertString(lixiangShenheTime,"yyyy-MM-dd") +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
