package com.example.nice_admin.services;

import java.util.List;
import java.util.Optional;

import com.example.nice_admin.models.VehicleMaintenance;
import com.example.nice_admin.repositories.VehicleMaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VehicleMaintenanceService {
	
	
	@Autowired
	private VehicleMaintenanceRepository vehicleMaintenanceRepository;
	
	//Return list of vehicleMaintenances
	public List<VehicleMaintenance> getVehicleMaintenances(){
		return vehicleMaintenanceRepository.findAll();
	}
	
	//SAve new vehicleMaintenance
	public void save(VehicleMaintenance vehicleMaintenance) {
		vehicleMaintenanceRepository.save(vehicleMaintenance);
	}
	
	//get by id
	public Optional<VehicleMaintenance> findById(int id) {
		return vehicleMaintenanceRepository.findById(id);
	}

	public void delete(Integer id) {
		vehicleMaintenanceRepository.deleteById(id);
	}


}
