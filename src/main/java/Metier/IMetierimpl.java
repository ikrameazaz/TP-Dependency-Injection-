package Metier;

import DAO.Dao;

public class IMetierimpl implements IMetier {

    private Dao dao ;

    public IMetierimpl(Dao dao) {
        this.dao = dao;
    }

    public IMetierimpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getdata();
        double res = t*23;
        return res;
    }

/* pour injecter dans la variable dao un objet
 d'une classe qui implemente l'interface Idao
*/
    public void setDao(Dao dao) {
        this.dao = dao;
    }
}
