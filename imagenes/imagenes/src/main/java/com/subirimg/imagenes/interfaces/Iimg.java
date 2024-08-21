package com.subirimg.imagenes.interfaces;

import com.subirimg.imagenes.models.img;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Iimg extends JpaRepository<img, String> {
}