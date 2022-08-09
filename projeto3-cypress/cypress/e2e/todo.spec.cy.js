//describe('empty spec', () => {
//  it('passes', () => {
//    cy.visit('https://example.cypress.io')
//  })
//})

context('todo', () => {

  it('passes', () => {
    //acesar a url do site 
    cy.visit('https://todomvc.com/examples/react/#/')

    //escrever no campo
    cy.get('body > section > div > header > input')
      .type('teste')
      .type('{enter}')

    //cy.get("")

    //validação
    cy.get('ul.todo-list li').should('have.length', 1)

    //clicar no primeiro da lista
    cy.get('input.toggle').click()

    //filtrar 
    cy.get('body > section > div > footer > ul > li:nth-child(3) > a').click()

    //validação
    cy.get('body > section > div > section > ul > li').should('have.length', 0);
  })

})