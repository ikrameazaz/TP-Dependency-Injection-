package org.example.presentation;

import org.example.DAO.DAOimpl;
import org.example.DAO.Dao;
import org.example.metier.IMetier;
import org.example.metier.MetierImp;

public class PresentationV1 {
    public static void main(String[] args) {
        /* injection des dependances par instanciation statique > new */
        DAOimpl d = new DAOimpl();
       /* Metierimpl metier = new Metierimpl();
         metier.setDao(d); // injection via setter */

        MetierImp metier = new MetierImp(d); // injection via constructeur
        System.out.println("RES ="+metier.calcul());

    }
}
