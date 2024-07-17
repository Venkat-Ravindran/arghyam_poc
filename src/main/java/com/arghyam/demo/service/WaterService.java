package com.arghyam.demo.service;

import com.arghyam.demo.entity.Water;
import com.arghyam.demo.repo.WaterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WaterService {
    private final WaterRepository waterRepository;

    public WaterService(WaterRepository waterRepository) {
        this.waterRepository = waterRepository;
    }

    public Water saveWaterDetails(Water water) {
        try {
            return waterRepository.save(water);
        } catch (Exception e) {
            // Handle exception or log the error
            throw new RuntimeException("Failed to save water details: " + e.getMessage());
        }
    }

    public List<Water> fetchAllWaterDetails() {
        try {
            return waterRepository.findAll();
        } catch (Exception e) {
            // Handle exception or log the error
            throw new RuntimeException("Failed to fetch all water details: " + e.getMessage());
        }
    }

    public Optional<Water> fetchWaterById(Long id) {
        try {
            return waterRepository.findById(id);
        } catch (Exception e) {
            // Handle exception or log the error
            throw new RuntimeException("Failed to fetch water by ID: " + e.getMessage());
        }
    }

}
