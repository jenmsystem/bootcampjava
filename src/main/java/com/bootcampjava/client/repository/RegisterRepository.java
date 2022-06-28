package com.bootcampjava.client.repository;

import com.bootcampjava.client.domain.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register, Long> {
}
