package com.difelix.bleach.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.difelix.bleach.models.enums.TiposPersonagem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "humano")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Humano {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "habilidades", length = 300)
	private String habilidades;
	
	@Column(name = "aliado")
	private TiposPersonagem aliado;
	
	@JoinColumn(name = "personagem_humano")
	@OneToOne
	private Personagem personagem;
}
