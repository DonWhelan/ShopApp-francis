/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopapp;

import java.io.Serializable;

/**
 *
 * @author donwhelan1
 */
public class Shop implements Serializable {
    
    private String prod;
    private int id;

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getInfo(){
        return "\n" + "Product: " + prod + "\n" + "ID: " + id;
    }
    
}
