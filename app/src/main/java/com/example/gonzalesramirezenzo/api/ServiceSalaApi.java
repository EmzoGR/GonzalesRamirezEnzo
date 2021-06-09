package com.example.gonzalesramirezenzo.api;

import com.example.gonzalesramirezenzo.entity.Proveedor;

import java.util.List;
import java.util.Optional;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ServiceSalaApi {

    @GET("proveedor")
    public abstract Call<List<Proveedor>> listaProveedor();

    @GET("sala/{id}")
    public abstract  Call<Optional<Proveedor>> buscaSala(String id);

    @POST("sala")
    public abstract Call<Proveedor> insertaSala(@Body Proveedor obj);

    @PUT("sala")
    public abstract Call<Proveedor> actualizaSala(@Body Proveedor obj);

    @DELETE("sala/{id}")
    public abstract Call<Proveedor> eliminaSala(@Path("id")String id);
}
