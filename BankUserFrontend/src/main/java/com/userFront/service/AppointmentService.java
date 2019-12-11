package com.userFront.service;

import java.util.List;

import com.userFront.entities.Appointment;

/*
 * 
 *  @Ben Judicaelle@ Love Coding
 */

public interface AppointmentService {
	Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}
