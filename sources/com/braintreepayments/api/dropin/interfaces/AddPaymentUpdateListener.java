package com.braintreepayments.api.dropin.interfaces;

import android.view.View;

public interface AddPaymentUpdateListener {
    void onBackRequested(View view);

    void onPaymentUpdated(View view);
}
