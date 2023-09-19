describe('StudentFormComponent', () => {
  beforeEach(() => {
    cy.visit('http://localhost:4200/addstudents');
  });

  it('should submit the form with valid data', () => {
    cy.get('#name').type('Orcun Bat');
    cy.get('#email').type('orcun.bat@edu.tbz.ch');
    cy.get('form').submit();
    cy.url().should('eq', 'http://localhost:4200/students');
  });

  it('should disable the submit button when form is invalid', () => {
    cy.get('button[type="submit"]').should('be.disabled');
    cy.get('#name').type('Orcun Bat');
    cy.get('button[type="submit"]').should('be.disabled');
  });
});
