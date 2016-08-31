package crm.domain;

import javax.persistence.*;

@Table(name = "searchInfo_t")
@Entity
public class SearchInfo {
    @Id
    @GeneratedValue
    @Column(name = "searchId")
    private int searchId;
    @Column(name = "make")
    private String make;
    @Column(name = "cost")
    private String cost;
    @Column(name = "content")
    private String content;
    @Column(name = "model")
    private String model;

    public SearchInfo(String make, String cost, String content, String model) {
        this.make = make;
        this.cost = cost;
        this.content = content;
        this.model = model;
    }

    public SearchInfo() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSearchId() {
        return searchId;
    }

    public void setSearchId(int searchId) {
        this.searchId = searchId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

}
