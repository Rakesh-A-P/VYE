#Feature: Entity Enrollement
 #
     # @License
  #Scenario Outline: Fill all the vaild data for entity enrollement 
    #Given User is in Identifying Information Section
    #When User Goes to Provider Identifier information Section from Sheet <sheetName> and row <rowNum> and Option <Options>
    #And Fills all the Details of Provider Identifiers from Sheet <sheetName> and row <rowNum> and Options <Options>
    #Then User goes to Ownership section and Select as <OptionsOwnership> for All the Answers from Sheet <sheetName> and row <rowNum> table <mutlipledata>
    #Then User goes to Key Personel and Add Multiple Key Personel from Sheet <sheetName> and row <rowNum>
    #And User Goes to Exclusion Sanction Information Section and Select <Options>
    #Then User Fills the EFT Information from Sheet <sheetName> and row <rowNum>
    #Then User goes to Address Details and fills all the details from Sheet <sheetName> and row <rowNum> and Options as <Options>
    #Then User Goes to Program Participation Section from Sheet <sheetName> and row <rowNum>
    #Then User Goes to Service Location Section and Adds a Service Location from Sheet <sheetName> and row <rowNum> and Options as <Options>
    #Then if the heath home serivce is visible then fill the data
    #And Goes to Upload Docuements and Uploads Spesific Files
    #Then User Signs the Provider Agreement and Click Next
    #And User Fills the Summary Details and Submit from Sheet <sheetName> and row <rowNum>
    #Then User proceed to sign in
   #And Logout from Provider Portal
    #
    #Examples: 
      #| sheetName                   | rowNum | Options | OptionsOwnership |mutlipledata|
      #| Invaild data for individual |      0 | yes     | yes               |1       |
