package Presentation;
import DAO.DAOimpl;
import DAO.Dao;
import Metier.IMetier;
import Metier.IMetierimpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Scanner;

public class PresV2 {
    public static void main(String[] args)  {
        try {

            Scanner sc = new Scanner(new File("config.txt"));

            //DAOimpl d = new DAOimpl();
            String DAOclassname = sc.nextLine();
            Class cDAO = Class.forName(DAOclassname);
            Dao dao = (Dao) cDAO.getConstructor().newInstance();
            System.out.println(dao.getdata());

            // IMetierimpl metier = new IMetierimpl(d);
            String Metierclassname = sc.nextLine();
            Class cMetier = Class.forName(Metierclassname);
            IMetier metier = (IMetier) cMetier.getConstructor(Dao.class).newInstance(dao);
            System.out.println("RES="+metier.calcul());

            // metier.setDao(d);
            Method SetDao = cMetier.getDeclaredMethod("SetDao", Dao.class);
            SetDao.invoke(metier,dao);


        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}
