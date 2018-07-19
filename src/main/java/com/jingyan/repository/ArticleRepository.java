package com.jingyan.repository;

import com.jingyan.domain.ContentZH;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<com.jingyan.domain.ContentZH,Integer> {
    public ContentZH findByUuid(String uuid);
}
