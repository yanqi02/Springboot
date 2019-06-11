package com.example.gbooks.repository;

import com.example.gbooks.entity.books;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface bookRepository extends JpaRepository<books,String> {
    public List<books> findAll();
}
