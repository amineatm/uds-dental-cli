package com.uds.service;

import com.uds.dao.AppointmentDAO;
import com.uds.domain.Appointment;
import com.uds.dto.AppointmentDto;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AppointmentService {
    private final AppointmentDAO dao;

    public AppointmentService(AppointmentDAO dao) {
        this.dao = dao;
    }

    public List<AppointmentDto> getAppointmentsByQuarter(int year, int quarter) {
        int startMonth = (quarter - 1) * 3 + 1;
        int endMonth = startMonth + 2;

        return dao.getAll().stream()
                .filter(a -> a.getDate().getYear() == year)
                .filter(a -> {
                    int m = a.getDate().getMonthValue();
                    return m >= startMonth && m <= endMonth;
                })
                .sorted(Comparator.comparing(Appointment::getDate).reversed())
                .map(AppointmentDto::new)
                .collect(Collectors.toList());
    }
}
