package ru.example.springbootrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.example.springbootrest.entity.CreditEntity;

@Repository
public interface CreditRepository extends JpaRepository<CreditEntity, Integer> {
}