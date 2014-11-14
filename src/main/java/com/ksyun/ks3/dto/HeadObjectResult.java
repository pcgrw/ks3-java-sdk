package com.ksyun.ks3.dto;

import java.util.Date;

/**
 * @author lijunwei[13810414122@163.com]  
 * 
 * @date 2014年10月22日 下午8:01:05
 * 
 * @description Head请求一个object
 **/
public class HeadObjectResult {
	private ObjectMetadata objectMetadata = new ObjectMetadata();
	/**
	 * false 
	 * object为null
	 * false 即http 304 一般用于缓存控制
	 */
	private boolean ifModified = true;
	/**
	 * false
	 * object为null
	 * false 即http 412 一般用于缓存控制
	 */
	private boolean ifPreconditionSuccess = true;
	
	public ObjectMetadata getObjectMetadata() {
		return objectMetadata;
	}

	public void setObjectMetadata(ObjectMetadata objectMetadata) {
		this.objectMetadata = objectMetadata;
	}

	public boolean isIfModified() {
		return ifModified;
	}

	public void setIfModified(boolean ifModified) {
		this.ifModified = ifModified;
	}

	public boolean isIfPreconditionSuccess() {
		return ifPreconditionSuccess;
	}

	public void setIfPreconditionSuccess(boolean ifPreconditionSuccess) {
		this.ifPreconditionSuccess = ifPreconditionSuccess;
	}

	public String toString()
	{
		return "HeadObjectResult[ifModified="+this.isIfModified()+",ifPreconditionSuccess="+this.isIfPreconditionSuccess()+",objectMetadata="+this.objectMetadata+"]";
	}
}
