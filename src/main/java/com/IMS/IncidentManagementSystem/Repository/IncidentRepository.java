package com.IMS.IncidentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IMS.IncidentManagementSystem.model.Incident;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, Long> {
    Incident findByIncidentId(String incidentId);
}