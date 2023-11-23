package com.example.myappxyz;

public class DataClass {
    private String dataNombre;
    private String dataMarca;
    private String dataPrecio;
    private String dataImage;
    private String key;

    public DataClass(String nombres, String marcas, String precios, String imageURL) {
    }

    public DataClass(String dataNombre, String dataMarca, String dataPrecio, String dataImage, String key) {
        this.dataNombre = dataNombre;
        this.dataMarca = dataMarca;
        this.dataPrecio = dataPrecio;
        this.dataImage = dataImage;
        this.key = key;
    }

    public String getDataNombre() {
        return dataNombre;
    }

    public void setDataNombre(String dataNombre) {
        this.dataNombre = dataNombre;
    }

    public String getDataMarca() {
        return dataMarca;
    }

    public void setDataMarca(String dataMarca) {
        this.dataMarca = dataMarca;
    }

    public String getDataPrecio() {
        return dataPrecio;
    }

    public void setDataPrecio(String dataPrecio) {
        this.dataPrecio = dataPrecio;
    }

    public String getDataImage() {
        return dataImage;
    }

    public void setDataImage(String dataImage) {
        this.dataImage = dataImage;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
