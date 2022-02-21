package br.com.agendaapi.model.repository;

import br.com.agendaapi.model.entidade.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato,Integer> {
}
