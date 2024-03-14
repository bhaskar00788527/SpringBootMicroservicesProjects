package com.Bhaskar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bhaskar.entity.Plan;

@Repository
public interface PlanRepository  extends JpaRepository<Plan, Long>{



}
