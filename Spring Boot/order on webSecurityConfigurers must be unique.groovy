
Error
Caused by: java.lang.IllegalStateException: @Order on WebSecurityConfigurers must be unique. 

Solution
means there are more than one @EnableWebSecurity in the project.
need to delete one.
