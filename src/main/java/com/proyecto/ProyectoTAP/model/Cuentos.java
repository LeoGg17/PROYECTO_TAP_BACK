package com.proyecto.ProyectoTAP.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cuentos")
public class Cuentos {

    @Id
    private String _id;
    private String username;
    private String autor;

    public String getIdCuento() {
        return _id;
    }

    public void setIdCuento(String _id) {
        this._id = _id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
