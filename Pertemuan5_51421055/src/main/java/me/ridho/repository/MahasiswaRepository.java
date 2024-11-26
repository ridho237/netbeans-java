package me.ridho.repository;

/**
 *
 * @author Muhammad Ridho
 */
import me.ridho.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
        
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Long> {
    
}
