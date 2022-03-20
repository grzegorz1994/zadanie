package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.repository.TableTestRepository;
import org.example.repository.entity.Tabela;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TabelaService {

    private final TableTestRepository repository;

    public List<Tabela> getAllTables(){
        return repository.findAll();
    }

    public List<Tabela> findColumn(){
        return repository.findColumn();
    }
}
