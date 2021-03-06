package com.ksyun.ks3.service.response;

import com.ksyun.ks3.dto.Ks3Result;

public class DeleteBucketLifecycleResponse extends Ks3WebServiceDefaultResponse<Ks3Result> {

    public int[] expectedStatus() {
    	return new int[]{200,204};
    }

    @Override
    public void preHandle() {
    	this.result = new Ks3Result();
    }
}
