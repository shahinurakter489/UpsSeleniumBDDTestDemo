Feature: This feature file is for citibank SignInPage feature

  @Sanity @Regression
  Scenario: Verify UPS customer SignIn
    Given Customer in UPS SignIn page
    When Customer gives userName input "Brazil"
    And Customer gives emailId input "Argentina"
    And Customer give the userId  input"asdf@yahoo.com"
    And Customer gives the password input "weee"
    And Customer gives the PhoneNumber input "23555"
    And Customer click the Agree button
    And Customer click the Sign In button
    Then Customer should be able to SignIn

  @Regression @Smoke @Sprint07
  Scenario Outline: Verify citiBank customer SignOn using wrong userid and wrong password
    Given Customer in citibank SignOn page
    When Customer gives userid input "<UserID>"
    And Customer gives password input "<Password>"
    And Customer clicks the submit button
    Then Customer should NOT be able to login

    Examples: 
      | UserID | Password |
      | Hello  | World    |
      | Robin  | Hood     |
