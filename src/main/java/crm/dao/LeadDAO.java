package crm.dao;

import crm.domain.Lead;
import org.springframework.orm.hibernate3.HibernateTemplate;

import org.springframework.stereotype.Component;

@Component
public class LeadDAO {

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    public Lead add(Lead lead){
        hibernateTemplate.save(lead);
        return lead;
    }

    public void delete(int leadId){
        Lead lead = get(leadId);
        hibernateTemplate.delete(lead);
    }

    public Lead get(int leadId){
        Lead lead = (Lead) hibernateTemplate.get(Lead.class,leadId);
        return lead;
    }

    public Lead getAllLead(){
        return (Lead) hibernateTemplate.loadAll(Lead.class);
    }
}
