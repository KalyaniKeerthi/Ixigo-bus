Feature: Ixigo

Scenario: Bus Booking
Given I am on Ixigo home page 
And I click on Buses
Then I can see Book Bus Tickets page

Scenario: Book Bus Tickets
Given I am on Ixigo home page 
And I click on Buses
Then I can see Book Bus Tickets page
And I click on From Station
When I give "Hyderabad"
And I click on To Station
When I give station as "Vijayawada"
And I click on Tomorrow
And I click on Search
Then I can see Buses on this route
Then I scroll down


Scenario: Track Ticket
Given I am on Ixigo home page 
When I click on Buses
And I can see Book Bus Tickets page
And I click on Track Ticket
Then I can see Track Ticket page

Scenario: APSRTC Bus
Given I am on Ixigo home page 
When I click on Buses
And I am on Book Bus Tickets page 
And I scroll down 
And I click on APSRTC 
Then I can see APSRTC Bus Tickets page







