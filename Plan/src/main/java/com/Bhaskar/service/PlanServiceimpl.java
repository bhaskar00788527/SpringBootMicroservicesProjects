package com.Bhaskar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.Bhaskar.entity.Plan;
import com.Bhaskar.repository.PlanRepository;

@Service
public class PlanServiceimpl implements PlanService {

	@Autowired
	private PlanRepository planRepo;

	@Override
	public List<Plan> getAllPlans() {
		return planRepo.findAll();
		
	}

	@Override
	public Plan save(Plan plan) {
		
		return planRepo.save(plan);
	}
	
	
}
