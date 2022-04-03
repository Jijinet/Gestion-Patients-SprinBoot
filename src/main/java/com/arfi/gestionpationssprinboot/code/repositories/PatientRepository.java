package com.arfi.gestionpationssprinboot.code.repositories;

import com.arfi.gestionpationssprinboot.code.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {

    public Page<Patient> findByFirstNameContains(String name, PageRequest pageRequest);
}
