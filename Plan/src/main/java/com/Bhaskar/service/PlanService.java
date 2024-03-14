package com.Bhaskar.service;

import java.util.List;

import com.Bhaskar.entity.Plan;

public interface PlanService {

	
//	public Plan save(Plan plan);
	
	public List<Plan> getAllPlans();

	public Plan save(Plan plan);
}
