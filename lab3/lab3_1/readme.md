### a)
In the file `EmployeeRepositoryTest`, there's a chaining happening in the method `public void givenSetOfEmployees_whenFindAll_thenReturnAllEmployees()`, on the last line, where you can read 
`assertThat(allEmployees).hasSize(3).extracting(Employee::getName).containsOnly(alex.getName(), ron.getName(), bob.getName());`
there are tests that are getting chained together.

You can also find a test chain in the method
`public void whenFindEmployedByExistingId_thenReturnEmployee()`
where you can read
`assertThat(fromDb.getEmail()).isEqualTo( emp.getEmail());`

### b)
In the file `EmployeeService_UnitTest`
all the tests are unit tests, using Mockito and JUnit, making them not connected to the database.

### c)
Using `@Mock`, the tests being done can be compared to unit tests, since we are mocking behaviour, independently from SpringBoot.
Using `@MockBean`, we are adding Mockito mocks to the SpringBoot app.
Basically, we use `@Mock` to mock behaviour, independently from spring dependencies.
Otherwise we use `@MockBean`.

### d)
The role of the `application-integrationtest.properties` file is to deploy a database in a docker container where the SpringBoot application will run on.