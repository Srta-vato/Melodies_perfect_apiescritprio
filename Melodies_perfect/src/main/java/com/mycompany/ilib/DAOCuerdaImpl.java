package com.mycompany.ilib;

import com.mycompany.db.Database;
import com.mycompany.models.Cuerda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.interfaces.DAOCuerda;
import java.sql.SQLException;

public class DAOCuerdaImpl extends Database implements DAOCuerda {


    @Override
    public List<Cuerda> listar(String nombre) throws Exception {
        List<Cuerda> lista = null;
        try {
            this.Conectar();
            String Query = nombre.isEmpty() ? "SELECT * FROM cuerda;" : "SELECT * FROM cuerda WHERE nombre LIKE '%" + nombre + "%';";
            try (PreparedStatement st = this.conexion.prepareStatement(Query)) {
                lista = new ArrayList();
                ResultSet rs = st.executeQuery();
                while(rs.next()) {
                    Cuerda cuerda = new Cuerda();
                    cuerda.setId(rs.getInt("id"));
                    cuerda.setNombre(rs.getString("nombre"));
                    cuerda.setCategoria(rs.getString("categoria"));
                    cuerda.setDescripcion(rs.getString("descripcion"));
                    cuerda.setPrecio(rs.getFloat("precio"));
                    cuerda.setDisponibles(rs.getInt("disponibles"));
                    cuerda.setColor(rs.getString("color"));
                    
                    lista.add(cuerda);
                }
                rs.close();
            }
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public Cuerda getBookById(int bookId) throws Exception {
        Cuerda cuerda = null;
        
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM cuerda WHERE id = ? LIMIT 1;");
            st.setInt(1, bookId);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                cuerda = new Cuerda();
                cuerda.setId(rs.getInt("id"));
                cuerda.setNombre(rs.getString("nombre"));
                cuerda.setCategoria(rs.getString("categoria"));
                cuerda.setDescripcion(rs.getString("descripcion"));
                cuerda.setPrecio(rs.getFloat("precio"));
                cuerda.setDisponibles(rs.getInt("disponibles"));
                cuerda.setColor(rs.getString("color"));
                
            }
            rs.close();
            st.close();
        } catch(ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return cuerda;
    }   

    @Override
    public void registrar(Cuerda book) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificar(Cuerda book) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int bookId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}