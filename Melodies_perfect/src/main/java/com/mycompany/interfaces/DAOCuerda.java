package com.mycompany.interfaces;

import com.mycompany.models.Cuerda;
import java.util.List;

public interface DAOCuerda {
    public void registrar(Cuerda book) throws Exception;
    public void modificar(Cuerda book) throws Exception;
    public void eliminar(int bookId) throws Exception;
    public List<Cuerda> listar(String title) throws Exception;
    public Cuerda getBookById(int bookId) throws Exception;
}
