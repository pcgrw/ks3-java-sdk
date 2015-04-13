package com.ksyun.ks3.service.response;

import com.ksyun.ks3.dto.PutObjectResult;
import com.ksyun.ks3.exception.Ks3ClientException;
import com.ksyun.ks3.http.HttpHeaders;
import com.ksyun.ks3.service.response.support.Md5CheckAble;

/**
 * @author lijunwei[lijunwei@kingsoft.com]  
 * 
 * @date 2014年10月22日 下午2:00:58
 * 
 * @description 
 **/
public class PutObjectResponse extends Ks3WebServiceDefaultResponse<PutObjectResult> implements Md5CheckAble{

	public int[] expectedStatus() {
		return new int[]{200};
	}

	@Override
	public void preHandle() {
		result = new PutObjectResult();
		result.seteTag(this.getHeader(HttpHeaders.ETag.toString()));
		result.setTaskid(super.getHeader(HttpHeaders.TaskId.toString()));
		result.setSseAlgorithm(super.getHeader(HttpHeaders.XKssServerSideEncryption.toString()));
		result.setSseCustomerAlgorithm(super.getHeader(HttpHeaders.XKssServerSideEncryptionCustomerAlgorithm.toString()));
		result.setSseCustomerKeyMD5(HttpHeaders.XkssServerSideEncryptionCustomerKeyMD5.toString());
		result.setSseKMSKeyId(super.getHeader(HttpHeaders.XKssServerSideEncryptionKMSKeyId.toString()));
	}

	public String getETag() {
		return this.getHeader(HttpHeaders.ETag.toString());
	}
}
