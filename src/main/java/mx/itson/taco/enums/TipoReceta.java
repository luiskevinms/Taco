/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.taco.enums;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author alumnog
 */
public enum TipoReceta {
    @SerializedName("1")
    COMIDA,
    @SerializedName("2")
    POSTRE,
    @SerializedName("3")
    BEBIDA,
    @SerializedName("4")
    OTRO;
}
