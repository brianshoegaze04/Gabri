package com.taxi.pe.cliente.datepicker;

public interface HorizontalPickerListener {
    void onDateSelected(Day day);

    void onDraggingPicker();

    void onStopDraggingPicker();
}
