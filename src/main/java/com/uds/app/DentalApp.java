package com.uds.app;

import com.uds.data.AppointmentRepository;
import com.uds.service.AppointmentService;

public class Main {
    public static void main(String[] args) {
        AppointmentRepository repository = new AppointmentRepository();
        AppointmentService service = new AppointmentService(repository);

        try {
            String json = service.getAppointmentsByQuarter(2025, 1);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
