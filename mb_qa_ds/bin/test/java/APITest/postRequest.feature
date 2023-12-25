Feature: Petstore Post Request

Background: 
  Given url baseURL
  * def bodyRequestUser = 
    """
    [
      {
        "username": "username",
        "firstName": "User",
        "lastName": "Name",
        "email": "username@email.com",
        "password": "username",
        "phone": "085",
        "userStatus": 1
      }
    ]
    """
  * def headersRequest = { Accept: 'application/json', Content-Type: 'application/json' }

@usertest
Scenario: Create user with list
  When path "/user/createWithList"
  And headers headersRequest
  And request bodyRequestUser
  And method post
  Then status 200
  And response.message == 'ok'
