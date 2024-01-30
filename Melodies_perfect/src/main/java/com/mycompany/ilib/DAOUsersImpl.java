package com.mycompany.ilib;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOUsers;
import com.mycompany.models.Users;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class DAOUsersImpl extends Database implements DAOUsers {

    @Override
    public void registrar(Users user) throws Exception {
        try {
            this.Conectar();
            try (PreparedStatement st = this.conexion.prepareStatement("INSERT INTO usuarios(Nombre, Apellido, Corrreo, Direccion, Telefono) VALUES(?,?,?,?,?);")) {
                st.setString(1, user.getNombre());
                st.setString(2, user.getApellido());
                st.setString(3, user.getCorrreo());
                st.setString(4, user.getDireccion());
                st.setString(5, user.getTelefono());
                st.executeUpdate();
            }
        } catch(ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Users user) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE users SET Nombre = ?, Apellido = ?, Correo = ?, Direccion = ?, Telefono = ? WHERE id = ?");
            st.setString(1, user.getNombre());
            st.setString(2, user.getApellido());
            st.setString(3, user.getCorrreo());
            st.setString(4, user.getDireccion());
            st.setString(5, user.getTelefono());
            st.setInt(6, user.getId());
            st.executeUpdate();
            st.close();
        } catch(ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void sancionar(Users user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int userId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Users> listar(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Users getUserById(int userId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    



    
}
