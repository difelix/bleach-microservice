package com.difelix.bleach.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.difelix.bleach.models.enums.PosicaoShinigami;
import com.difelix.bleach.models.enums.EsquadraoShinigami;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "shinigami")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Shinigami {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "esquadrao", length = 300)
	private EsquadraoShinigami esquadrao;
	
	@Column(name = "posicao", length = 255)
	private PosicaoShinigami posicao;
	
	@Column(name = "zanpakutou", length = 255)
	private String zanpakutou;
	
	@JoinColumn(name = "personagem_shinigami")
	@OneToOne
	private Personagem personagem;
}
