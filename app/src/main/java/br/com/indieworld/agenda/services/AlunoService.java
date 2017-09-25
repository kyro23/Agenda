package br.com.indieworld.agenda.services;

import java.util.List;

import br.com.indieworld.agenda.dto.AlunoSync;
import br.com.indieworld.agenda.model.Aluno;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Junior on 24/09/2017.
 */

public interface AlunoService {

    @POST("aluno")
    Call<Void> insere(@Body Aluno aluno);

    @GET("aluno")
    Call<AlunoSync> lista();
}