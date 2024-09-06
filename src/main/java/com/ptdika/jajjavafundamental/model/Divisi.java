package main.java.com.ptdika.jajjavafundamental.model;


import java.util.List;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 05/09/2024 22:09
@Last Modified 05/09/2024 22:09
Version 1.0
*/
public class Divisi {
    private Integer id;
    private String namaDivisi;
    private String deskripsiDivisi;
    private Long contohLongDivisi;
    private Double contohLongDouble;
    private List<BuatPassing> lt;

    public List<BuatPassing> getLt() {
        return lt;
    }

    public void setLt(List<BuatPassing> lt) {
        this.lt = lt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public String getDeskripsiDivisi() {
        return deskripsiDivisi;
    }

    public void setDeskripsiDivisi(String deskripsiDivisi) {
        this.deskripsiDivisi = deskripsiDivisi;
    }

    public Long getContohLongDivisi() {
        return contohLongDivisi;
    }

    public void setContohLongDivisi(Long contohLongDivisi) {
        this.contohLongDivisi = contohLongDivisi;
    }

    public Double getContohLongDouble() {
        return contohLongDouble;
    }

    public void setContohLongDouble(Double contohLongDouble) {
        this.contohLongDouble = contohLongDouble;
    }
}
