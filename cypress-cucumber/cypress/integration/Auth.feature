
Feature: create conta

Scenario Outline: criar nova conta com sucesso
    Given que acesso o sistema <sistema>
    And preencho com o email <email>
    When clico no botao create an account
    
    Examples:
        | sistema                                                                           | email                 | 
        | http://automationpractice.com/index.php?controller=authentication&back=my-account | gnsdjgbsdgs@gmail.com |   