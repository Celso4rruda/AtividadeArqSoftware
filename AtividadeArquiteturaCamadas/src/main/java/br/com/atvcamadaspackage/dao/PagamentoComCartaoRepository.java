package br.com.atvcamadaspackage.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.atvcamadaspackage.dominio.*;

@Repository
public interface PagamentoComCartaoRepository extends JpaRepository<PagamentoComCartao, Integer>{

}
