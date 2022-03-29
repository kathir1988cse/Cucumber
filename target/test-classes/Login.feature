
Feature: Validate Full End To End Functionality  for demo Blaze

  Scenario: Validating full functionality with all correct details
    Given Select departure and destination city
    And User should click find flights
    When user should click first choose this flight
    And User Enters Name address city state zipcode 
    Then User should select card type
    And User should select Creditcard no month year Name on Card
    When User Click remember me check box and click purchase flight 
    And Copy the order id and write into excel
    
