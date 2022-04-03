package com.arfi.gestionpationssprinboot;

import com.arfi.gestionpationssprinboot.code.entities.Patient;
import com.arfi.gestionpationssprinboot.code.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class GestionPationsSprinBootApplication implements CommandLineRunner {

    @Autowired
    PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(GestionPationsSprinBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "Jihane","Arfi", "jihane@machlou.com"));
        patientRepository.save(new Patient(null, "Abderrahim","Machlou", "jihane@machlou.com"));
        patientRepository.save(new Patient(null, "Ayoub","Berached", "ayoub@machlou.com"));
        patientRepository.save(new Patient(null, "Aziz","Daaif", "aziz@machlou.com"));
        patientRepository.save(new Patient(null, "Mohamed","Youssfi", "med@machlou.com"));
    }
}
