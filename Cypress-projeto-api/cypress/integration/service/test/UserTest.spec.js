import UserService from "../requests/UserService.request";
const userService = new UserService;

const payloadAddUser = require('../payload/Add-user-1.json')
const payloadAddUser2 = require('../payload/Add-user-2.json')

context('Users', () => {

  it('GET - Consultar usuarios', () => {

    // Chamada service
    userService.getAllUsers().as('response')

    // Validações
    cy.get('@response').should((response) => {
       expect(response.status).to.eq(200);
       expect(response.body).to.be.not.null;
     })
  })  
  
  it('Post - Adicionar usuario', () => {

    // Chamada service
    userService.postUser(payloadAddUser).as('response')

    // Validações
    cy.get('@response').should((response) => {
       expect(response.status).to.eq(200);
       expect(response.body.id).to.eq(10);
       expect(response.body.userName).to.eq('Gustavo');
       expect(response.body.password).to.eq('Gustavo123');
     })
  })    
  
  it('GET - Consultar usuario por id', () => {
    const idUser = 10;
    // Chamada service
    userService.getUserById(idUser).as('response')

    // Validações
    cy.get('@response').should((response) => {
       expect(response.status).to.eq(200);
       expect(response.body).to.be.not.null;
        expect(response.body.id).to.eq(idUser);
     })
  })  

  it('Put - Editar usuario por id', () => {
    const idUser = 10;
    // Chamada service
    userService.putUser(idUser, payloadAddUser2).as('response')

    // Validações
    cy.get('@response').should((response) => {
       expect(response.status).to.eq(200);
       expect(response.body).to.be.not.null;
       expect(response.body.id).to.eq(idUser);
       expect(response.body.userName).to.eq('GustavoEditado');
     })
  })  

  it('Delete - deletar usuario por id', () => {
    const idUser = 10;
    // Chamada service
    userService.postUser(payloadAddUser).as('response')
    userService.deleteUser(idUser).as('response')

    // Validações
    cy.get('@response').should((response) => {
       expect(response.status).to.eq(200);
   })  
  })

  it('Delete - deletar usuario por id inexistente', () => {
    const idUser = 55555;
    // Chamada service
    userService.postUser(payloadAddUser).as('response')
    userService.deleteUser(idUser).as('response')

    // Validações
    cy.get('@response').should((response) => {
       expect(response.status).to.eq(200);
   })  
  })
})
