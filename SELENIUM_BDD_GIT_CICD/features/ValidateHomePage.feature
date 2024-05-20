Feature: Validating Home Page 

  Scenario: Verify BonGarcia Home Page
    Given I Open Bongaricia Home Page
    When I click on WebForm icone
    And I click on submit button 
    Then I validate the Received as outcome
  
