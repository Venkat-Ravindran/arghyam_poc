package com.arghyam.demo.repo;

import com.arghyam.demo.entity.Water;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WaterRepository extends JpaRepository<Water, Long> {
    @Query(value = "SELECT * FROM water_details WHERE village_name=?",nativeQuery = true)
    Water findByVillageName(String villageName);
}
