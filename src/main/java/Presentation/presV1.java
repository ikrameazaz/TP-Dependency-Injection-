package Presentation;

import DAO.DAOimpl;
import Metier.IMetierimpl;

public class presV1 {
    public static void main(String[] args) {
        /* injection des dependances par instanciation statique > new */
         DAOimpl d = new DAOimpl();
       /* IMetierimpl metier = new IMetierimpl();
         metier.setDao(d); // injection via setter */

        IMetierimpl metier = new IMetierimpl(d); // injection via constructeur
        System.out.println("RES ="+metier.calcul());

    }
}
