# Backend for the Tess_two OpenCV 4D Result Checker Mobile Application.

Curent Status of the Project : Stopped Development after the version 2.0.0

## Introduction

Mobile application will send request to this web API with information such as drawingDate, drawingService and gameType and the web API will return lottery result if record found.

## Changelog

- version 0.0.1 - SNAPSHOT
    - Added `logging.xml` to configure the LogBack.
- version 1.0.0
    - First Release
- version 2.0.0
    - Not backward compatible with version 1.0.0
    - Removed DatabaseCheck.java ( Moved the function inside DateValidator)
    - On certain case, according to the application logic, it has to query the database twice to get the result, this is needed to check if there is a Special Drawing on Tuesday.
        


## Guide

Using this application

Dowload and unzip the source repository or clone it using Git:
    
    git clone http://github.com/ebiggerr/tess_two_opencv_4dresult_checker_backend.git
    
 Create application.properties file under "src\main\resources"
 This file is to configure the Spring Boot Application.
 
 The configuration is for PostgreSQL database server.
 
    spring.datasource.url={YOUR-DATABASE-URL}
    spring.datasource.username={YOUR-DATABASE-USERNAME}
    spring.datasource.password={YOUR-DATABASE-PASSWORD}
    spring.datasource.initialization-mode=always
    spring.datasource.platform=postgres
    
    spring.datasource.driver-class-name=org.postgresql.Driver
    spring.jpa.database-platform = org.hibernate.dialect.PostgreSQL10Dialect
    
    
 

## Contributing

- As A Developer <br>
If you are a developer and you wish to contribute to the building of this backend, please fork this project and submit a pull request on the `add-features` branch.

- **First Time?** <br>
How about take a look at the `good first issues` first? Click the badge below to see all the beginner-friendly issues.

  [![good first issues open](https://img.shields.io/github/issues/electron-react-boilerplate/electron-react-boilerplate/good%20first%20issue.svg)](https://github.com/ebiggerr/tess_two_opencv_4dresult_checker_backend/issues?q=is%3Aissue+is%3Aopen+label%3A%22good+first+issue%22)

## Licensing
This `Tess_Two OpenCV 4DResult Checker Backend` is licensed under the `GNU v3 Public License`

You can view the license here or at the project directory `/LICENSES/GPL v3.LICENSE`.
(https://github.com/ebiggerr/tess_two_opencv_4dresult_checker_backend/blob/master/LICENSES/GPL%20v3.LICENSE).