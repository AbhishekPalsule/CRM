package crm.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lead_t")
public class Lead {
    @Id
    @GeneratedValue
    @Column(name = "lead_id")
    private int leadId;
    @Column(name = "is_promising")
    private boolean isPromising;
    @Column(name = "date")
    private Date date;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "lead_id")
    private SearchInfo searchInfoId;

    public Lead() {
    }

    public Lead(boolean isPromising, Date date) {
        this.isPromising = isPromising;
        this.date = date;
    }

    public SearchInfo getSearchInfoId() {
        return searchInfoId;
    }

    public void setSearchInfoId(SearchInfo searchInfoId) {
        this.searchInfoId = searchInfoId;
    }

    public int getLeadId() {
        return leadId;
    }

    public void setLeadId(int leadId) {
        this.leadId = leadId;
    }

    public boolean isPromising() {
        return isPromising;
    }

    public void setPromising(boolean promising) {
        isPromising = promising;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
