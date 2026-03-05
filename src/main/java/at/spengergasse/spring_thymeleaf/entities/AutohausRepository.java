package at.spengergasse.spring_thymeleaf.entities;

import org.springframework.stereotype.Repository;

@Repository
    public interface AutohausRepository extends org.springframework.data.jpa.repository.JpaRepository<Autohaus, Integer> {
}

