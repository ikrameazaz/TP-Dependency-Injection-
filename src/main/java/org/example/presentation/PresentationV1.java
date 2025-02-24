package org.example.presentation;

import org.example.DAO.DAOimpl;
import org.example.DAO.Dao;
import org.example.metier.IMetier;
import org.example.metier.MetierImp;

public class PresentationV1 {
    public static void main(String[] args) {

        //Injection des dépendances par instanciation statique
        Dao dao=new DAOimpl();
        MetierImp metier=new MetierImp();
        metier.setDao(dao);
        System.out.println("'Injection via setter :'   Resultat : "+metier.calcul());

        IMetier metierr= new IMetier(dao);//Injection via le constructeur
        System.out.println(" 'Injection via le constructeur : '    Resultat : "+metier.calcul());


    }
}
