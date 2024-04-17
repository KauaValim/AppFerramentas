/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.OCDAO;

/**
 *
 * @author S.Lucas
 */
public class OCController {
    private OCDAO ocDAO;
    
    public OCController() {
        ocDAO = new OCDAO();
    }
    
    public long getLastId(){
        if (ocDAO.getLastId())
    }
}
