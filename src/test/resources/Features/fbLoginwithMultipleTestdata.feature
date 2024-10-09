Feature: Facebook login functionality

  Scenario Outline: Title of your scenario outline
    Given Open any browser with fb URL
    When User type "<Username>" and "<Password>"
    And Click on Login button
    Then System will display error message or not

    Examples: 
      | Username                         | Password                 |
      | sravanthiwetsfasfagasf@gamil.com | SDF#@%$tfdgdhdsg         |
      | TejaSrisfasfagasf@gamil.com      | w4e5rtghSDF#@%$tfdgdhdsg |
      | h2otestingtools@gamil.com        | Test@123                 |
