package org.sid.cinema.SOAP.models;

import java.util.Date;

public class Film {
    private  Long id;
    private String titre;
    private String description;
    private String realisateur;
    private Date dateSortie;
    private double duree;
    private String photo;

    public Film(Integer id, String title, String description, Date date, double v, String photo) {
    }

    public Film(Long id, String titre, String description, String realisateur, Date dateSortie, double duree, String photo) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.realisateur = realisateur;
        this.dateSortie = dateSortie;
        this.duree = duree;
        this.photo = photo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
