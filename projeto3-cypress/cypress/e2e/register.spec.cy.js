
context('register', () => {

  it('passes', () => {
    //acesar a url do site 
    cy.visit('https://demoqa.com/register')

    //escrever no campo
    cy.get('#firstname')
      .type('Gustavo')

    cy.get('#lastname')
      .type('Teichmann')  
     
    cy.get('#userName')
      .type('GustavoT')
     
    cy.get('#password')
      .type('Gustavo23')
     
    cy.get('#recaptcha-anchor > div.recaptcha-checkbox-border')  
      .click({force: true})
   
    cy.get('#register')  
      .click()

    cy.get('#gotologin')  
      .click()
















    //cy.get("")

    //validação
    //cy.get('ul.todo-list li').should('have.length', 1)

    //clicar no primeiro da lista
    //cy.get('input.toggle').click()

    //filtrar 
    //cy.get('body > section > div > footer > ul > li:nth-child(3) > a').click()

    //validação
    //cy.get('body > section > div > section > ul > li').should('have.length', 0);
  })

})