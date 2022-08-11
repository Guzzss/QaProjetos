

Feature: create user

Scenario Outline: criar novo user com sucesso
    Given que acesso o respectivo sistema <sistema>
    And clico no Mr.
    And preencho o campo first Name 
    And preencho o campo last Name
    And preencho o campo password 
    And seleciono o respectivo dia 
    And seleciono o respectivo mes
    And seleciono o respectivo ano
    And preencho o campo first Name Address 
    And preencho o campo last Name Address
    And preencho o campo company
    And preencho o campo Address
    And preencho o campo City
    And clico no respectivo country
    And preencho o campo postal code
    And clico no respectivo estado 
    And preencho o campo mobile phone
    And preencho o campo reference
    When clico no botao register
    Then devo verificar se esta logado
    
    Examples:
        | sistema                                                                           |         
        | http://automationpractice.com/index.php?controller=authentication&back=my-account |


Scenario Outline: criar novo user sem sucesso
    Given que acesso o respectivo sistema <sistema>
    And clico no Mr.
    And preencho o campo first Name 
    And preencho o campo last Name
    # And preencho o campo password 
    And seleciono o respectivo dia 
    And seleciono o respectivo mes
    And seleciono o respectivo ano
    And preencho o campo first Name Address 
    And preencho o campo last Name Address
    And preencho o campo company
    And preencho o campo Address
    And preencho o campo City
    And clico no respectivo country
    And preencho o campo postal code
    And clico no respectivo estado 
    And preencho o campo mobile phone
    And preencho o campo reference
    When clico no botao register
    Then devo verificar mensagem de quando o campo password esta vazio
    
    Examples:
        | sistema                                                                           |         
        | http://automationpractice.com/index.php?controller=authentication&back=my-account |


