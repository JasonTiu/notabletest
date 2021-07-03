package com.example.springtest.doctor;

import com.example.springtest.appointment.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getDoctors(){
        return doctorRepository.findAll();
    }

    public void addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }


}
