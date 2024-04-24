Feature: LexisNexis get financial service information

  Scenario: Check financial service compliance information is available
    Given User is on Home page of LexisNexis site    
    And User accepts the cookie pop-up
    When  User clicks on Choose Your Industry option
    Then User should see following option
    | Industry |    
    |  Financial Services    |  
    |  Insurance   |  
    |  Life and Pensions   |  
    |  Corporations and Non-Profits   |    
    When User clicks on Insurance option
    And Refresh the page
    When User clicks on Choose Your Industry option
    When User clicks on Life and Pensions option
    And Refresh the page
    When User clicks on Choose Your Industry option
		When User clicks on Corporations and Non-Profits option
    And Refresh the page	
    When User clicks on Choose Your Industry option	    
    When User clicks on Financial services link
    Then User should see following links on Financial Services
 		| Field Name | 
    |  Financial Crime Compliance   |  
    |  Customer Data Management   |  
    |  Collections and Recovery   |  
    |  Risk Orchestration   | 
    |  Fraud and Identity Management  |
    |  Credit Risk Assessment   |
    |  Investigations and Due Diligence   |
    When User clicks on Financial Crime Compliance link
    Then Verify the title page is matched