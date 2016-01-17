package com.ernando.cobranca;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ernando.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long>{

}
