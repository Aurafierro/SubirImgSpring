package com.subirimg.imagenes.models;

import jakarta.persistence.*;

@Entity
public class img {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_img", nullable = false, length = 36)
    private String idImg;

    @Column(name = "Nombre_espacio", nullable = false, length = 100)
    private String nombreEspacio;

    @Column(name = "Descripcion", nullable = false, length = 100)
    private String descripcion;

    @Lob
    @Column(name = "Imagen")
    private byte[] imagen;

    public img() {
        super();
    }

    public img(String idImg, String nombreEspacio, String descripcion, byte[] imagen) {
        super();
        this.idImg = idImg;
        this.nombreEspacio = nombreEspacio;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getIdImg() {
        return idImg;
    }

    public void setIdImg(String idImg) {
        this.idImg = idImg;
    }

    public String getNombreEspacio() {
        return nombreEspacio;
    }

    public void setNombreEspacio(String nombreEspacio) {
        this.nombreEspacio = nombreEspacio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}
