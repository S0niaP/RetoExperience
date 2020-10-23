@tag1
Feature: Creation of users
  I as user, I want to create a user for navigate in web page.

  Background: Itialize the browser
    Given The user start the navigator

  @case1
  Scenario: Create a user
    Given The user can sing in he inserts his mail "juan_perez10@hotmail.com"
    When he fills the form
      | Gender | First Name | Last Name | Password | Birth Day | Birth Month | Birth Year | Company | Address   | City          | State      | Postal Code | Country       | Mobile Phone | Address Alias |
      | Mr     | Juan       | Perez     | AB123    |        14 |           7 |       1996 | CMR     | Street 24 | San francisco | California |       94016 | United States |    555512686 | home          |
    Then he can see his name in the page "Juan Perez"