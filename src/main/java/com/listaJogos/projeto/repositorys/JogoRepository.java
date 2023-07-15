package com.listaJogos.projeto.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.listaJogos.projeto.models.Jogo;
import com.listaJogos.projeto.projections.JogoMinProjection;
@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long>{
    @Query(nativeQuery = true, value = """
		SELECT tb_jogo.id, tb_jogo.titulo, tb_jogo.ano, tb_jogo.imagem,
		tb_jogo.DESCRICAO_CURTA  AS descricaoCurta, tb_pertencimento.posicao
		FROM tb_jogo
		INNER JOIN tb_pertencimento ON tb_jogo.id = tb_pertencimento.jogo_id
		WHERE tb_pertencimento.lista_id = :listId
		ORDER BY tb_pertencimento.posicao
			""")
    List<JogoMinProjection> searchByList(Long listId);
}
