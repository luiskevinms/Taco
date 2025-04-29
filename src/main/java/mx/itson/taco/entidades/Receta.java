/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.taco.entidades;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import mx.itson.taco.enums.TipoReceta;

/**
 *
 * @author alumnog
 */
public class Receta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the porciones
     */
    public int getPorciones() {
        return porciones;
    }

    /**
     * @param porciones the porciones to set
     */
    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    /**
     * @return the tipo
     */
    public TipoReceta getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoReceta tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the ingredientes
     */
    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * @return the procedimiento
     */
    public List<Procedimiento> getProcedimiento() {
        return procedimiento;
    }

    /**
     * @param procedimiento the procedimiento to set
     */
    public void setProcedimiento(List<Procedimiento> procedimiento) {
        this.procedimiento = procedimiento;
    }
    
    private String nombre;
    private int porciones;
    private TipoReceta tipo;
    private List<Ingrediente> ingredientes;
    private List<Procedimiento> procedimiento;
    
    public static List<Receta> deserializar(String json){
        List<Receta> recetas = new ArrayList<>();
        try {
            Gson gson = new Gson();
            Type lista = new TypeToken<List<Receta>>() {}.getType();
            recetas = gson.fromJson(json, lista);
        }catch(Exception ex){
            System.err.println("Error al deserializar");
        }
        return recetas;
    }
    
 public static Receta deserializarObjeto(String json){
     Receta r = new Receta ();
     try {
         Gson gson = new Gson();
         r = gson.fromJson(json, Receta.class);
     }catch(Exception ex) {
         System.err.println("Error al deserializar");
     } return r;
 }   
 
    
}
