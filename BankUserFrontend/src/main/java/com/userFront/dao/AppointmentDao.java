package com.userFront.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.userFront.entities.Appointment;
/*
 * 
 *  @Ben Judicaelle@ Love Coding
 */
public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
