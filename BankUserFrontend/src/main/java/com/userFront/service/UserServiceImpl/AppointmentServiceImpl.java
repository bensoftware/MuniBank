package com.userFront.service.UserServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userFront.service.AppointmentService;
import com.userFront.dao.AppointmentDao;
import com.userFront.entities.Appointment;

/*
 * 
 *  @Ben Judicaelle@ Love Coding
 */

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentDao appointmentDao;

    public Appointment createAppointment(Appointment appointment) {
       return appointmentDao.save(appointment);
    }

    public List<Appointment> findAll() {
        return appointmentDao.findAll();
    }

    public Appointment findAppointment(Long id) {
        return appointmentDao.findOne(id);
    }

    public void confirmAppointment(Long id) {
        Appointment appointment = findAppointment(id);
        appointment.setConfirmed(true);
        appointmentDao.save(appointment);
    }
}
