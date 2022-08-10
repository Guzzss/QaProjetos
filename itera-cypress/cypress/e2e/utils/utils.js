export default class utils {

  navegar(url) {
    cy.visit(url)
  }

  telaCheia() {
    cy.viewport(1280, 720)
  }
  
  click(element) {
    cy.get(element).click()
  }

  clickForce(element) {
      cy.get(element).click({force: true})
  }

  preencherInput(element, text) {
    cy.get(element).clear()
    cy.get(element).type(text)
  }

  preencherInputComTeclaNoFinal(element, text, tecla) {
    cy.get(element).type(text).type(tecla)
  }

  preencherInputForce(element, text){ 
    cy.get(element).type(text, {force:true})
 }
 
 tempo(tempo){ 
    cy.wait(tempo) 
 }

 select(element, value){ 
    cy.get(element).select(value) 
 }

 validarText(element, text){ 
    cy.get(element).should('contain', text) 
 }

 validarQuantItemNaLista(element, quant){
    cy.get(element).should('have.length', quant)
 }

}
