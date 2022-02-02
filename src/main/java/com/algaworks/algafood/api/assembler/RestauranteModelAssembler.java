package com.algaworks.algafood.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.api.model.RestauranteModel;
import com.algaworks.algafood.api.model.input.RestauranteInput;
import com.algaworks.algafood.domain.model.Restaurante;

@Component
public class RestauranteModelAssembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public RestauranteModel toModel(Restaurante restaurante) {
		return modelMapper.map(restaurante, RestauranteModel.class);
		
//		*** Antes do ModelMapper ***
//		CozinhaModel cozinhaDTO = new CozinhaModel();
//		cozinhaDTO.setId(restaurante.getCozinha().getId());
//		cozinhaDTO.setNome(restaurante.getCozinha().getNome());
//		
//		RestauranteModel restauranteDTO = new RestauranteModel();
//		restauranteDTO.setId(restaurante.getId());
//		restauranteDTO.setNome(restaurante.getNome());
//		restauranteDTO.setTaxaFrete(restaurante.getTaxaFrete());
//		restauranteDTO.setCozinha(cozinhaDTO);
//		return restauranteDTO;
	}
	
	public List<RestauranteModel> toCollectionModel(List<Restaurante> restaurantes) {
		return restaurantes.stream()
				.map(restaurante -> toModel(restaurante))
				.collect(Collectors.toList());
	}
	
	public RestauranteInput toInputObject(Restaurante restaurante) {
		return modelMapper.map(restaurante, RestauranteInput.class);
		
//		*** Antes do ModelMapper ***
//		RestauranteInput restauranteInput = new RestauranteInput();
//		restauranteInput.setNome(restaurante.getNome());
//		restauranteInput.setTaxaFrete(restaurante.getTaxaFrete());
//		
//		CozinhaIdInput cozinhaIdInput = new CozinhaIdInput();
//		cozinhaIdInput.setId(restaurante.getCozinha().getId());
//		
//		restauranteInput.setCozinha(cozinhaIdInput);
//		
//		return restauranteInput;
	}

}
