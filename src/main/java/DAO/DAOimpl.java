package DAO;

public class DAOimpl implements Dao {
    @Override
    public double getdata() {
        System.out.println("version base de donnees");
        double temp =23;
        return temp;
    }
}
