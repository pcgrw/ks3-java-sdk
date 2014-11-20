package com.ksyun.ks3.dto;

/**
 * @author lijunwei[13810414122@163.com]  
 * 
 * @date 2014年10月22日 上午10:36:46
 * 
 * @description 对ks3 bucket或object的{@link AccessControlList}的一种快捷配置方式
 **/
public enum CannedAccessControlList {
	/**
	 * 私有
	 */
	Private("private"),
	/**
	 * 公开读
	 */
	PublicRead("public-read"), 
	/**
	 * 公开读写
	 */
	PublicReadWrite("public-read-write");
	private final String cannedAclHeader;

	private CannedAccessControlList(String cannedAclHeader) {
		this.cannedAclHeader = cannedAclHeader;
	}
	public String toString() {
		return cannedAclHeader;
	}
}
