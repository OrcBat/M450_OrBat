describe('StudentListComponent', () => {
  beforeEach(() => {
    cy.visit('http://localhost:4200/students');
  });

  it('should display a list of students', () => {
    const mockStudents = [
      { id: 1, name: 'Jonas', email: 'jonas@tbz.ch' },
      { id: 2, name: 'Patrick', email: 'patrick@tbz.ch' },
    ];

    cy.intercept('GET', 'http://localhost:4200/students', {
      body: mockStudents,
    }).as('getStudents');

    cy.get('.table tbody tr').should('have.length', 35);
    cy.get('.table tbody tr').eq(0).should('contain', 'Jonas');
    cy.get('.table tbody tr').eq(1).should('contain', 'Patrick');
  });
});
