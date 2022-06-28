package com.bootcampjava.client.repository;

import com.bootcampjava.client.domain.Fund;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundRepository extends JpaRepository<Fund, Long> {
}
