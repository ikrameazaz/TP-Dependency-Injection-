package org.example.DAO;


import org.springframework.stereotype.Component;

@Component("d")
public class DAOimpl implements Dao{
    @Override
        public double getData() {
            System.out.println("version BD");
            double data=21;
            return data;
        }

}

