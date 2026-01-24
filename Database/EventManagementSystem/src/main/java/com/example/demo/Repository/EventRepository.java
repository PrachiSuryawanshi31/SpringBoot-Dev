package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
	

}
