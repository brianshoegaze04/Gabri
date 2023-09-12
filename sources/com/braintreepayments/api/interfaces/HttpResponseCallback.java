package com.braintreepayments.api.interfaces;

public interface HttpResponseCallback {
    void failure(Exception exception);

    void success(String str);
}
