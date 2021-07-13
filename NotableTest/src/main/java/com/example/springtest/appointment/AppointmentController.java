package com.example.springtest.appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Appointment")
public class AppointmentController {

    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping
    public List<Appointment> getAppointments(){
        return appointmentService.getAppointments();
    }

    @PostMapping
    public void addAppointment(@RequestBody Appointment appointment)
    {
        appointmentService.addAppointment(appointment);
    }

    @DeleteMapping(path = "{appointmentId}")
    public void deleteAppointment(@PathVariable("appointmentId") Long appointmentId)
    {
        appointmentService.deleteAppointment(appointmentId);
    }

    @GetMapping(path = "{doctorId}/{appDate}")
    public List<Appointment> getDocApp(@PathVariable("doctorId")Long docId, @PathVariable("appDate") LocalTime appTime)
    {
        return appointmentService.getDocApp(docId, appTime);
    }

}
