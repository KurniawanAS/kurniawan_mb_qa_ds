# API Testing Using Karate Framework

---

Homework 7 API Automation
by: Kurniawan Adi Saputra

---

### For Running on the Console
- Run tests runner by className
 ```
  - mvn clean test -Dtest=${nameclassjava}
  Example : mvn clean test -DTest=Runner
  ```

- Run parallel all test 
 ```
mvn test "-Dkarate.options=--tags ~${nametag}"
Example : mvn test "-Dkarate.options=--tags selectedtag"
  ```

### Karate Sources
- https://github.com/karatelabs/karate