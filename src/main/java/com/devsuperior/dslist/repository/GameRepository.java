package com.devsuperior.dslist.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dslist.entities.Game;

//Repository é uma interface que faz a comunicação com o banco de dados

//Aqui estamos criando um repositório que estende JpaRepository, da classe Game, cujo o ID é do tipo Long
public interface GameRepository extends JpaRepository<Game, Long> {
	
}
