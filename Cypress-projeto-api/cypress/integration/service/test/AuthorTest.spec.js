import AuthorService from "../requests/AuthorService.request";
const authorService = new AuthorService;

const payloadAddAuthor = require("../payload/Add-author-1.json");
const payloadAddAuthor2 = require("../payload/Add-author-2.json");
const payloadAddAuthor3 = require("../payload/Add-author-3.json");

context('Authors', () => {

  it('GET - Consultar Autores', () => {

    // Chamada service
    authorService.getAllAuthors().as('response')

    // Validações
    cy.get('@response').should((response) => {
       expect(response.status).to.eq(200);
       expect(response.body).to.be.not.null;
     })
                               
  })

  it('GET - Consultar Autores por id do Author', () => {
    const idAuthor = 250;

    // Adiciona um Author
    authorService.postAuthor(payloadAddAuthor).as('response')
    // Chamada service
    authorService.getAuthorsById(idAuthor).as('response')

    // Validações
    cy.get('@response').should((response) => {
       expect(response.status).to.eq(200);
       expect(response.body).to.be.not.null;
       expect(response.body.id).to.eq(idAuthor);
     })

    })

  it('GET - Consultar Autores por id do book', () => {
    const idBook = 25;

    // Adiciona um Author
    authorService.postAuthor(payloadAddAuthor).as('response')
    // Chamada service
    authorService.getAuthorsByIdBook(idBook).as('response')

    // Validações
    cy.get('@response').should((response) => {
       expect(response.status).to.eq(200);
       expect(response.body).to.be.not.null;
       expect(responde.body[0].idBook).to.eq(idBook);
     })
                               
  })

  it('Post - Criar Autor', () => {

    // Chamada service
    authorService.postAuthor(payloadAddAuthor).as('response')

    // Validações
    cy.get('@response').should((response) => {
       expect(response.status).to.eq(200);
       expect(response.body.id).to.eq(250);
       expect(response.body.firstName).to.eq('Gustavo');
     })
                               
  })

  it('Put - Editar um Autor', () => {

    const idAuthor = 250;
    // Chamada service
    authorService.putAuthor(payloadAddAuthor2,idAuthor).as('response')
    // Validações
    cy.get('@response').should((response) => {
       expect(response.status).to.eq(200);
       expect(response.body.id).to.eq(250);
     })                            
  })

  it('Put - Editar um Autor não existente', () => {

    const idAuthor = 5555;
    // Chamada service
    authorService.putAuthor(payloadAddAuthor3,idAuthor).as('response')
    // Validações
    cy.get('@response').should((response) => {
       expect(response.status).to.eq(200);
       expect(response.body.id).to.eq(55555);
     })                            
  })

  it('Delete - deleta um Autor', () => {

    const idAuthor = 250;
    // Chamada service
    authorService.deleteAuthor(idAuthor).as('response')
    // Validações
    cy.get('@response').should((response) => {
       expect(response.status).to.eq(200);
     })                            
  })
  
  it('Delete - deleta um Autor não existente', () => {

    const idAuthor = 55555;
    // Chamada service
    authorService.deleteAuthor(idAuthor).as('response')
    // Validações
    cy.get('@response').should((response) => {
       expect(response.status).to.eq(200);
     })                            
  })

})