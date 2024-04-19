package DTOs;

import DAOs.EmployeeDaoInterface;
import DAOs.MySqlEmployeeDao;
import Exceptions.DaoException;
import Utilities.Adaptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalDate;
import java.util.List;

public class JsonConverter {
    //converter gets the employees from the database and converts them to a JSON String format to be displayed
    public String jsonEmployeeList() throws DaoException{
        //String stores the employee information for each employee in the database
        String jsonEmployees = "";
        try {
            //connects to the database and stores all the employees there in a list
            EmployeeDaoInterface IEmployeeDao = new MySqlEmployeeDao();
            List<Employee> employee = IEmployeeDao.getAllEmployees();
            /**
             * Author: Luke Hilliard
             * Other contributors: Katie Lynch
             * Gson Parser takes one employee and parses its information before it outputs as a Json String. Added .setPrettyPrinting to separate each Json String to the next line
             */
            //creating the gsonParser that will display the Json Strings in a readable format
            Gson gsonParser = new GsonBuilder()
                    .setPrettyPrinting()//makes the JSON output more readable for users - e.g. adds whitespace between the different values being displayed
                    .registerTypeAdapter(LocalDate.class, new Adaptor())
                    .create();
            //takes each individual employee, applies the parser to the employees information and stores all the new formatted employees
            jsonEmployees = gsonParser.toJson(employee);

        } catch(DaoException e) {
            System.out.println("Encountered An Error Displaying All Employees As A Json String: " + e.getMessage());
        }
        return jsonEmployees;

    }

}