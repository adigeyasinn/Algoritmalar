/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import database.transaction.HesapBilgileri;

/**
 *
 * @author feda1
 */
public interface IBilgiController {
    
    public boolean bilgilerGecerliMi();
    
    public HesapBilgileri getHesapBilgileri();
    
}
