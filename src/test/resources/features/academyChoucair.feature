#Autor: Harvin Moreno Palacios
@stories
Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
    @scenario1
    Scenario: Search for a automation course
      Given than Neto wants to learn automation at the Academy Choucair
      | strUser     |  strPassword     |
      | 1152467365  |  Choucair2021*   |
      When he search for the course on the choucair academy platform
      |            strCourse           |
      |     Metodología Bancolombia    |
      Then he finds the course called
      |          strCcourse            |
      |     Metodología Bancolombia    |

