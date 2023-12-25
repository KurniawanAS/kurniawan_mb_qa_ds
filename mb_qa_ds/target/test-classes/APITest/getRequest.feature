Feature: Petstore Get Request

Background:
  Given url baseURL
  * def username = 'username'
  # And print "----------- Coba test regres -----------"

@usertest
Scenario: Get existing user by username
  When path "/user/" + username
  And method get
  Then status 200
  And response.username == 'username'
  And response.firstName == 'User'
  And response.lastName == 'Name'
  And response.email == 'username@email.com'
  And response.phone == '085'