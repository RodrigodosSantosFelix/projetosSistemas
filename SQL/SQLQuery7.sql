
/*1*/
	SELECT
		Avaliacao.ProvaNome, Nota
	FROM
		Candidato, Avaliacao
	WHERE
		Candidato.Inscricao = Avaliacao.Inscricao AND Candidato.Inscricao = 102

/*2*/ 
	SELECT
		Avaliacao.ProvaNome, avg(Avaliacao.Nota)
	FROM
		Avaliacao
	
	group by
		Avaliacao.ProvaNome

/*3*/
	SELECT
		Avaliacao.Inscricao, CandidatoNome,Avaliacao.ProvaNome, Nota
	FROM
		Candidato, Avaliacao
	WHERE
		 Candidato.Inscricao = Avaliacao.Inscricao

/*4*/
	SELECT
		Candidato.Inscricao, CandidatoNome
	FROM
		Candidato, Avaliacao
	WHERE
		Candidato.Inscricao = Avaliacao.Inscricao
		AND
			Avaliacao.Nota < 5
	GROUP BY
		Candidato.Inscricao, CandidatoNome


/*5*/
	SELECT
		AVG(Nota)
	FROM
		 Avaliacao
	WHERE
		ProvaNome = 'Português'

/*6*/
	SELECT
		COUNT(*)
	FROM
		Avaliacao
	WHERE
		ProvaNome = 'Matemática'

/*7*/
	SELECT
		Candidato.Inscricao, Candidato.CandidatoNome
	FROM
		Avaliacao, Candidato
	WHERE
		Candidato.Inscricao = Avaliacao.Inscricao
		And ProvaNome = 'Matemática'