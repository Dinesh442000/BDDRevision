package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {


@Given("User is on NetBanking login page")
public void user_is_not_net_banking_login_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("User on net banking page");
}
//@When("User login into application")
//public void user_login_into_application() {
//    // Write code here that turns the phrase above into concrete actions
//	 System.out.println("User login into application");
//}

//@When("User login into application with {string} and password {string}")
//public void user_login_into_application_with_and_password(String userName, String password) {
//    // Write code here that turns the phrase above into concrete actions
//   System.out.println(userName + " "+ password);
//}


@When("user enters the mentioned data")
public void user_enters_the_mentioned_data(List <String> data) {
	System.out.println("Data from the data tables is as mentioned: ");
	System.out.println(data);
}


@When("^User login into application with (.+) and password (.+)$")
public void user_login_into_application_with_and_password(String userName, String password) {
    // Write code here that turns the phrase above into concrete actions
   System.out.println(userName + " "+ password);
}

@Then("Home Page is displayed")
public void home_page_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Home Page is displayed");
}
@And("Card are displayed")
public void card_are_displayed() {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Card are displayed");
}

@Given("setup the entries in database")
public void setup_the_entries_in_database() {
    // Write code here that turns the phrase above into concrete actions
 System.out.println("*****************");
 System.out.println("setup the entries in database");
}

@When("launch the browser from config variables")
public void launch_the_browser_from_config_variables() {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("*****************");
	 System.out.println("launch the browser from config variables");
  
}

@When("hit the home page url of banking site")
public void hit_the_home_page_url_of_banking_site() {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("*****************");
	 System.out.println("hit the home page url of banking site");
}



}
