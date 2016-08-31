package crm.Controller;

import crm.dao.LeadDAO;
import crm.dao.SearchInfoDAO;
import crm.dao.UserDAO;
import crm.domain.Lead;
import crm.domain.SearchInfo;
import crm.domain.User;
import crm.util.CSVUtility;
import crm.util.DateUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class InsertDataIntoTable {

    @Autowired
    private UserDAO userDAO = null;
    @Autowired
    private LeadDAO leadDAO = null;
    @Autowired
    private SearchInfoDAO searchInfoDAO = null;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public LeadDAO getLeadDAO() {
        return leadDAO;
    }

    public void setLeadDAO(LeadDAO leadDAO) {
        this.leadDAO = leadDAO;
    }

    public SearchInfoDAO getSearchInfoDAO() {
        return searchInfoDAO;
    }

    public void setSearchInfoDAO(SearchInfoDAO searchInfoDAO) {
        this.searchInfoDAO = searchInfoDAO;
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public @ResponseBody void insertData(){
        String delimiter = ",";
        ArrayList<String> lines = CSVUtility.readLine();
        for(String line: lines){
            String[] splitLine = line.split(delimiter);

            User user = new User();
            user.setName(splitLine[0]);
            user.setContact_no(splitLine[1]);
            user.setEmail(splitLine[2]);
            userDAO.add(user);

            SearchInfo searchInfo = new SearchInfo();
            searchInfo.setMake(splitLine[4]);
            searchInfo.setModel(splitLine[5]);
            searchInfo.setCost(splitLine[6]);
            searchInfo.setContent(splitLine[7]);
            searchInfoDAO.add(searchInfo);

            Lead lead = new Lead();
            lead.setDate(DateUtility.stringToDate(splitLine[3],"yyyy-MM-dd"));
            lead.setPromising(false);
            leadDAO.add(lead);
        }


    }


}
