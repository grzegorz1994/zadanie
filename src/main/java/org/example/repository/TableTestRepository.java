package org.example.repository;
import org.example.repository.entity.Tabela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TableTestRepository extends JpaRepository<Tabela,Long> {

    @Query("SELECT a FROM Tabela a")
    List<Tabela> findColumn();
}
