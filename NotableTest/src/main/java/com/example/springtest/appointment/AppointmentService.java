package com.example.springtest.appointment;


import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public List<Appointment> getAppointments(){
        return appointmentRepository.findAll();
    }


    public void addAppointment(Appointment appointment) {
        if (appointment.getAppTime().getMinute() % 15 != 0)
        {
            throw new IllegalStateException("app not 15 min interval");
        }
        else if(appointmentRepository.maxThreeApps(appointment.getDocId(),appointment.getAppTime()) >= 3)
        {
            throw new IllegalStateException("app time slot is full");
        }

        appointmentRepository.save(appointment);
    }

    public void deleteAppointment(Long id)
    {
        boolean exists = appointmentRepository.existsById(id);
        if (exists)
        {
            appointmentRepository.deleteById(id);
        }

    }

    public List<Appointment> getDocApp(Long docId, LocalTime appTime) {

        return appointmentRepository.findAppByDocTime(docId, appTime);
    }
}
