package com.inshort.base.entity;

public final class PublicStatusMessage {

    public static final int STATUS_LOADING = 1;
    public static final int HTTP_REQUEST_START=2;

    private int mStatus;
    private Object mValues;
    private PublicStatusMessage(int status, Object values){
        this.mStatus = status;
        this.mValues = values;
    }

    public static PublicStatusMessage createLoading(boolean isShowLoading){
        return new PublicStatusMessage(STATUS_LOADING,isShowLoading);
    }


}
