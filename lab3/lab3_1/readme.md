#### a)
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
