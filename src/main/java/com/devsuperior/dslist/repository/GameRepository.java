package com.devsuperior.dslist.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

//Repository é uma interface que faz a comunicação com o banco de dados

//Aqui estamos criando um repositório que estende JpaRepository, da classe Game, cujo o ID é do tipo Long
public interface GameRepository extends JpaRepository<Game, Long> {
	//@query é usado para fazer consultas personalizadas no banco de dados
		@Query(nativeQuery = true, value = """
				SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
				tb_game.short_description AS shortDescription, tb_belonging.position
				FROM tb_game
				INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
				WHERE tb_belonging.list_id = :listId
				ORDER BY tb_belonging.position
					""")
		// o listId é o id da lista que queremos buscar os jogos
		List<GameMinProjection> searchByList(Long listId);
}
