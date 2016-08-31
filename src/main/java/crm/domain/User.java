package crm.domain;

import javax.persistence.*;

@Table(name = "user_t")
@Entity
public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private int userId;
    @Column(name = "name")
    private String name;
    @Column(name = "contact_no")
    private String contact_no;
    @Column(name = "email")
    private String email;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Referral referedById;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Lead leadId;

    public User() {
    }

    public User(String name, String contact_no, String email, Referral referedById) {
        this.name = name;
        this.contact_no = contact_no;
        this.email = email;
        this.referedById = referedById;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Referral getReferedById() {
        return referedById;
    }

    public void setReferedById(Referral referedById) {
        this.referedById = referedById;
    }

    public Lead getLeadId() {
        return leadId;
    }

    public void setLeadId(Lead leadId) {
        this.leadId = leadId;
    }
}

