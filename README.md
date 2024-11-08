# **Challenge**

## **Project Structure**

```
src
└── main
    └── java
        └── com
            └── example
                └── orangehrm
                    ├── pages                    # Page Objects
                    │   ├── LoginPage.java
                    │   ├── RecruitmentPage.java
                    │   ├── CandidateFormPage.java
                    │   ├── InterviewPage.java
                    │   └── JobOfferPage.java
                    ├── tasks                    # Tasks (acciones de Screenplay)
                    │   ├── LoginTask.java
                    │   ├── AddCandidateTask.java
                    │   ├── ShortlistCandidateTask.java
                    │   ├── ScheduleInterviewTask.java
                    │   ├── MarkInterviewPassedTask.java
                    │   ├── OfferJobTask.java
                    │   └── HireCandidateTask.java
                    ├── steps                    # Steps Definitions de Cucumber
                    │   └── RecruitmentSteps.java
                    └── questions                # Questions (validaciones de estado)
                        └── CandidateStatusQuestion.java
└── test
    └── resources
        └── features                            # Features
            └── recruitment_process.feature

```

### Run all tests

`mvn clean test`
