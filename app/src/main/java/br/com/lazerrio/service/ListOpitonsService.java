package br.com.lazerrio.service;

import java.util.List;

import br.com.lazerrio.model.Option;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ListOpitonsService {

    @GET("shopping.php")
    public Call<List<Option>> listAllShoppings();

}