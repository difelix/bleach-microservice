package com.difelix.bleach.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "hollow")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Espada {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "posicao", nullable = false)
	private Integer posicao;
	
	@Column(name = "hollowficacao", length = 300)
	private String hollowficacao;
	
	@JoinColumn(name = "personagem_espada")
	private Personagem personagem;
}
