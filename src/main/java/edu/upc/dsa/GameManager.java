package edu.upc.dsa;

import edu.upc.dsa.models.*;

import java.util.List;

public interface GameManager {

    public void registrar(String username, String contraseña, String email);
    //public void newUser(String name, String username, List<Insignias> insignias);

    //void newUser(String name, String username, String avatar);

    void addInsignia(String username, String insignia);

    void createInsignia(String nameInsignia, String fotoURL);

    public boolean logIn (String username, String password);

    public Usuario getUser(String username);

    //Funciones para testear:
    public int usuariosSize();

    List<Usuario> getSortedUsersList();
}
