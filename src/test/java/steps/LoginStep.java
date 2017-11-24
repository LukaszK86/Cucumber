package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import java.util.ArrayList;
import java.util.List;

public class LoginStep {
    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        System.out.println("I navigate to the login page \n");
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        System.out.println("I click login button\n");
    }

    @Then("^I should see the user form page$")
    public void iShouldSeeTheUserFormPage() throws Throwable {
        System.out.println("I should see the user form page\n");
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {

//        System.out.println(data.get(0).get(0).toString());
//        System.out.println(data.get(0).get(1).toString());

        List<User> users = new ArrayList<User>();
        users=table.asList(User.class);

        for (User user: users){
            System.out.println("The username is " + user.userName);
            System.out.println("The password is " + user.password);
        }
    }
}
