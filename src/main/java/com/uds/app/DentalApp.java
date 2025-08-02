package com.uds.app;

import com.uds.dao.AppointmentDAO;
import com.uds.service.AppointmentService;
import com.uds.util.JSONConverterUtil;

public class DentalApp {
    public static void main(String[] args) {
        AppointmentService service = new AppointmentService(new AppointmentDAO());

        int year = 2025;
        int quarter = 1;

        var appointments = service.getAppointmentsByQuarter(year, quarter);
        String json = JSONConverterUtil.toJson(appointments);
        System.out.println(json);
    }
}
