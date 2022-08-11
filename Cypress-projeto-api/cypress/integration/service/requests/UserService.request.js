const API_URL = Cypress.env('API_BASE_URL')

const user = '/Users'

export default class UserService {

  getAllUsers(){
    return cy.request({
           method: 'GET',
           url: `${API_URL}${user}`,
           failOnStatusCode: false,
    })
  }

  postUser(payload){
    return cy.request({
            method: 'POST',
            url: `${API_URL}${user}`,
            failOnStatusCode: false,
            body: payload
    })
  }

  getUserById(idUser){
    return cy.request({
           method: 'GET',
           url: `${API_URL}${user}/${idUser}`,
           failOnStatusCode: false,
    })
  }

  putUser(idUser, payload) {
    return cy.request({
           method: 'PUT',
           url: `${API_URL}${user}/${idUser}`,
           failOnStatusCode: false,
           body: payload
    })      
  }

  deleteUser(idUser){
    return cy.request({
            method: 'DELETE',
            url: `${API_URL}${user}/${idUser}`,
            failOnStatusCode: false,
    })
  }
}