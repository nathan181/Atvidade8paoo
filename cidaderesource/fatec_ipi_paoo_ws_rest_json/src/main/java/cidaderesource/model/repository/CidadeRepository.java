package cidaderesource.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cidaderesource.model.beans.Cidade;

import java.util.List;

public interface CidadeRepository extends JpaRepository <Cidade, Long> {
	
  List<Cidade>findAllStartingWith(String letra);
}
