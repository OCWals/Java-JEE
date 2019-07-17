package com.OCWals.dao;

import java.util.List;

import com.OCWals.beans.Utilisateur;

public interface UtilisateurDao {
    void ajouter(Utilisateur utilisateur);
    List<Utilisateur> lister();
}