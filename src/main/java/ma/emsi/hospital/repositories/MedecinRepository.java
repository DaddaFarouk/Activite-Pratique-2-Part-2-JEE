package ma.emsi.hospital.repositories;

import ma.emsi.hospital.entities.Medecin;
import ma.emsi.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    Medecin findByNom(String nom);
}
