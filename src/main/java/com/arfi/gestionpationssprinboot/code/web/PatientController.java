package com.arfi.gestionpationssprinboot.code.web;

import com.arfi.gestionpationssprinboot.code.PatientRepository;
import com.arfi.gestionpationssprinboot.code.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Optional;

@RestController
@RequestMapping("/patients")
public class PatientController{

    @Autowired
    PatientRepository patientRepo;

    @PostMapping
    public Patient add(@RequestBody Patient p){
        return patientRepo.save(p);
    }

    @GetMapping
    public Page<Patient> getAll(@RequestParam(name="page",defaultValue = "0") int page,@RequestParam(name ="size",defaultValue = "3") int size){
        return patientRepo.findAll(PageRequest.of(page,size));
    }

    @GetMapping("/{id}")
    public Optional<Patient> getOne(@PathVariable Long id){
        return patientRepo.findById(id);
    }

    @PatchMapping
    public Patient update(@RequestBody Patient p){
        return patientRepo.save(p);
    }

    @GetMapping("/search")
    public Page<Patient> getPatientByName(@PathParam("name") String name,@RequestParam(name="page",defaultValue = "0") int page,@RequestParam(name ="size",defaultValue = "3") int size){
        return patientRepo.findByFirstNameContains(name,PageRequest.of(page,size));
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id){
        patientRepo.deleteById(id);
    }


}
