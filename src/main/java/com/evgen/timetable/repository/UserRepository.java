package com.evgen.timetable.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evgen.timetable.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findByLoginIgnoreCase(String login);

}