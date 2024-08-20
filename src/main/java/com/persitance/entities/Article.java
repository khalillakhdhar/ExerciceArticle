package com.persitance.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String auteur;
private String titre;
private String date;
private boolean publication;
private String type;
private String resume;

}
