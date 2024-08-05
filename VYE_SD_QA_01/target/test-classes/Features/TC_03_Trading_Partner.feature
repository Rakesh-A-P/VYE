@Trading_Partner
Feature: Trading Partner


     @TP
     Scenario Outline: Fill in the data with valid credentials for a Trading Partner
     Given user in the Home page and also navigate to Trading partner page 
     When Enter all the vaild credential for a Identifying Information section by using from Sheet <sheetName> and row <rowNum>
     And Enter all the vaild credential for Classification section by using from Sheet <sheetName> and row <rowNum>
     Then Enter the Npi credential for provider Identifiers section by using from Sheet <sheetName> and row <rowNum> and Npi option <NPIOption>
     And Fill the all the data for Ownership scetion by using from Sheet <sheetName> and row <rowNum> and option <OwnershipOption>
     And Fill the all the data for Keypersonal scetion by using from Sheet <sheetName> and row <rowNum>
     Then Performing Exclusion/Sanction Information section question by using Exclusion option <ExclusionOption>
     And Goes to Upload Docuements for Trading Partner and Uploads Spesific Files
     Then Enter all the data into Authorized Signature section by using from Sheet <sheetName> and row <rowNum>
     Then Perform the action on Affiliation section 
     And User Signs the Trading Partner Provider Agreement
     Then User Fills the Trading partner Summary Details and Submit from Sheet <sheetName> and row <rowNum>
     Then User proceed to sign in the Trading Partner 
     
     
     Examples:
     |sheetName      |rowNum|NPIOption|OwnershipOption|ExclusionOption|
     |Trading_Partner| 0    |yes      |yes            |yes            |


