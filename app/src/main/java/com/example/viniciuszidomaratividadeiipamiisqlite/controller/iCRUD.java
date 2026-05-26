package com.example.viniciuszidomaratividadeiipamiisqlite.controller;

public interface iCRUD<T> {
    public void incluir(T obj);
    public void alterar(T obj);
    public void deletar(T obj);
    public void listar(T obj);
}
