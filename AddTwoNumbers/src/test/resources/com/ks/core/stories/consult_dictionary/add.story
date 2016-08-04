Sample story

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development
					 
Scenario:  A scenario to test add numbers
Given a Abacus
When requested to add 5 and 2
Then the result should be 7

Scenario:  A scenario to test failure to add numbers
Given a Abacus
When requested to add 5 and -2
Then the result should be 7