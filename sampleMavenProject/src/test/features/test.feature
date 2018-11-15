Feature: First_automation_test_mail

  Scenario Outline: Confirmation mail

Given something new
    When hit <Zaloguj się>
    Then typein user login "lozagajarek@gmail.com"
    Then click <Dalejlogin> 
