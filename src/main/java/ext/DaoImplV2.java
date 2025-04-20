package ext;

import DAO.Dao;

public class DaoImplV2 implements Dao {

    @Override
    public double getdata() {
        System.out.println ("version web service");
        double t = 11;
        return t ;
    }
}
