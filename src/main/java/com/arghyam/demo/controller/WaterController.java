package com.arghyam.demo.controller;

import com.arghyam.demo.entity.Water;
import com.arghyam.demo.model.WaterModel;
import com.arghyam.demo.service.WaterService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class WaterController {

    private final WaterService waterService;

    public WaterController(WaterService waterService) {
        this.waterService = waterService;
    }

    @PostMapping(value = "/saveWater")
    public ResponseEntity<Water> saveProduct(
            @RequestHeader String villageName,
            @RequestBody WaterModel waterModel) {
        Water water = new Water();
        water.setVillage_name(villageName);
        water.setHardness(waterModel.getHardness());
        water.setTotal_houses(waterModel.getTotal_houses());
        water.setTotal_houses_with_tap(waterModel.getTotal_houses_with_tap());
        Water savedProduct = waterService.saveWaterDetails(water);
        return ResponseEntity.ok(savedProduct);
    }

    @GetMapping(value = "/getWater/{villageName}")
    public ResponseEntity<Water> getAllProducts(@PathVariable("villageName") String village){
        Water waterDetails = waterService.fetchWaterByName(village);
        return ResponseEntity.ok(waterDetails);
    }

    @GetMapping(value = "/getWater")
    public ResponseEntity<List<Water>> getAllProducts() {
        List<Water> waterDetails = waterService.fetchAllWaterDetails();
        return ResponseEntity.ok(waterDetails);
    }
}