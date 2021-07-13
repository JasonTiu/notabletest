package com.example.springtest.appointment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    @Query("SELECT a FROM Appointment a WHERE a.docId = ?1 AND a.appTime = ?2")
    List<Appointment> findAppByDocTime(Long docId, LocalTime appTime);

    @Query("SELECT COUNT(a) FROM Appointment a WHERE a.docId = ?1 AND a.appTime = ?2")
    int maxThreeApps(Long Id, LocalTime appTime);

}
