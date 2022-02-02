package com.algaworks.algafood.api.exceptionhandler;

import lombok.Getter;

@Getter
public enum ProblemType {
	
	ERRO_NEGOCIO("/erro-negocio", "Violação de regra de negócio."),
	DADOS_INVALIDOS("/dados-invalidos", "Dados inválidos"),
	ENTIDADE_EM_USO("/entidade-em-uso", "Entidade em uso."),
	ERRO_DE_SISTEMA("/erro-de-sistema", "Erro de sistema."),
	PARAMETRO_INVALIDO("/parametro-invalido", "Parâmetro inválido."),
	RECURSO_NAO_ENCONTRADO("/recurso-nao-encontrado", "Recurso não encontrado."),
	MENSAGEM_INCOMPREENSIVEL("/mensagem-incompreensivel", "Mensagem incompreensível.");
	
	private String uri;
	private String title;
	
	ProblemType(String path, String title) {
		this.uri = "https://algafood.com.br" + path;
		this.title = title;
	}

}
