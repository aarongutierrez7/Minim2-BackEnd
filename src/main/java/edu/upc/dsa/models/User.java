package edu.upc.dsa.models;

import java.util.List;

public class User {

    String name;
    String username;
    String avatar = "espinete.jpg";

    List<Insignias> listaInsignias;

    public User(String name, String username, String avatar) {
        this.name = name;
        this.username = username;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<Insignias> getListaInsignias() {
        return listaInsignias;
    }

    public void setListaInsignias(List<Insignias> listaInsignias) {
        this.listaInsignias = listaInsignias;
    }
}
