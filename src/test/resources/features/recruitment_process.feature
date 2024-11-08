@smoke
Feature: Complete recruitment process in OrangeHRM

  Scenario: Recruit a candidate from start to finish
    Given the user is on the login page
    When the user logs in with username "Admin" and password "admin123"
    And the user navigates to Recruitment and clicks on Add
    And the user fills in candidate details:
      | firstName | lastName | email          |
      | Testab    | Testab   | test@test.com  |
    And the user selects a random vacancy
    And the user clicks on Save
    And the user shortlists the candidate
    And the user schedules an interview with:
      | interviewTitle | interviewerHint | interviewDate |
      | Testab         | A               | today         |
    And the user marks the interview as passed
    And the user offers the job
    And the user hires the candidate
    Then the candidate with name "Testab Testab" should have status "Hired"