package com.bootcampjava.client.repository;

import com.bootcampjava.client.domain.Available;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvailableRepository extends JpaRepository<Available, Long> {
}
