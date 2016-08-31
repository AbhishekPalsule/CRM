package crm.dao;

import crm.domain.Referral;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class RefferalDAO {

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public Referral add(Referral referral){
        hibernateTemplate.save(referral);
        return referral;
    }

    public void delete(int referralId){
        Referral referral = get(referralId);
        hibernateTemplate.delete(referral);
    }

    public Referral get(int referralId){
        Referral referral = (Referral) hibernateTemplate.get(Referral.class,referralId);
        return referral;
    }

    public Referral getAllReferral(){
        return (Referral) hibernateTemplate.loadAll(Referral.class);
    }
}
