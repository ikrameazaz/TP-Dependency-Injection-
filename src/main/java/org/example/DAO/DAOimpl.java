package org.example.DAO;

public class DAOimpl implements Dao{
    @Override
        public double getData() {
            System.out.println("version BD");
            double data=21;
            return data;
        }

}

