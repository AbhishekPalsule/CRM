package crm.domain;



import javax.persistence.*;

@Table(name = "referral_t")
@Entity
public class Referral {
    @Id
    @GeneratedValue
    @Column(name = "refer_Id")
    private int referId;
    @Column(name = "referral_email")
    private String referralEmail;
    @Column(name = "referral_contactNo")
    private String referralContactNo;
    @Column(name = "referral_Name")
    private String referralName;
    @Column(name = "is_valid")
    private boolean isValid;

    public int getReferId() {
        return referId;
    }

    public void setReferId(int referId) {
        this.referId = referId;
    }

    public String getReferralEmail() {
        return referralEmail;
    }

    public void setReferralEmail(String referralEmail) {
        this.referralEmail = referralEmail;
    }

    public String getReferreeContactNo() {
        return referralContactNo;
    }

    public void setReferreeContactNo(String referreeContactNo) {
        this.referralContactNo = referreeContactNo;
    }

    public String getReferralName() {
        return referralName;
    }

    public void setReferralName(String referralName) {
        this.referralName = referralName;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
