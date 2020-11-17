package com.younify.backend.repository;

import com.younify.backend.entity.sales.Crm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrmRepository extends JpaRepository<Crm, Long> {
}
