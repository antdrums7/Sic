/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.util.Comparator;
import modelo.Cuenta;

/**
 *
 * @author rafae_000
 */
public class Comparador implements Comparator<Cuenta>{
    @Override
    public int compare(Cuenta c1, Cuenta c2){
        return c1.getCodigo()-c2.getCodigo();
    }
}
