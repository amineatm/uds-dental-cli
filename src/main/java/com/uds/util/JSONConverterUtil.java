package com.uds.util;


import com.uds.dto.AppointmentDto;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class JSONConverterUtil {
    public static String toJson(List<AppointmentDto> appointments) {
        JSONArray jsonArray = new JSONArray();
        for (AppointmentDto dto : appointments) {
            JSONObject json = new JSONObject();
            json.put("id", dto.getId());
            json.put("date", dto.getDate());
            json.put("time", dto.getTime());

            JSONObject patient = new JSONObject();
            patient.put("fullName", dto.getPatient().getFullName());
            patient.put("phoneNumber", dto.getPatient().getPhoneNumber());
            patient.put("dateOfBirth", dto.getPatient().getDateOfBirth());

            json.put("patient", patient);
            jsonArray.put(json);
        }
        return jsonArray.toString(2); // pretty print with 2 spaces
    }
}
