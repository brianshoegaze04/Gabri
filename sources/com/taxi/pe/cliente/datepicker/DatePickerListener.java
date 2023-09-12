package com.taxi.pe.cliente.datepicker;

import org.joda.time.DateTime;

public interface DatePickerListener {
    void onDateSelected(DateTime dateTime);
}
