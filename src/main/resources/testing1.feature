Feature: epam website testing

  Scenario: run a searching test
     Given we have https://www.epam.com/ open
      When click search button
      When search for Blockchain
      Then we have search results for Blockchain

  Scenario: run a external links test
     Given we have https://www.epam.com/ open
      When click INFOGEN button
      Then we have https://www.infongen.com/ open

  Scenario: run a external links test
     Given we have https://www.epam.com/ open
      When click mail button
      Then we have https://www.epam.com/about/who-we-are/contact open

  Scenario: run a button test
     Given we have https://www.epam.com/our-work/energy-and-utilities open
      When we click on explore our latest work button
      Then we see info about latest work

  Scenario: run a blog test
     Given we have https://www.epam.com/ open
      When we click on blog button
      Then we have blog article open 

  Scenario: run a main page service buttons test
     Given we have https://www.epam.com/ open
      When we click on Consult button
      Then we have https://www.epam.com/services/consult-and-design open

  Scenario: run a social media buttons test
     Given we have https://www.epam.com/ open
      When click twitter button
      Then we have epams twitter profile open

  Scenario: run a simple menu buttons test
     Given we have https://www.epam.com/ open
      When we click on menu button
      When we click on About button
      Then we have https://www.epam.com/about open
      