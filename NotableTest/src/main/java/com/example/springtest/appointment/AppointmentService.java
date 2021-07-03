package com.example.springtest.appointment;


import com.example.springtest.doctor.Doctor;
import com.example.springtest.doctor.DoctorRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
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

    public List<Appointment> getDocApp(Long docId, Date date) {

        return appointmentRepository.findAppByDocTime(docId, date);
    }
}
