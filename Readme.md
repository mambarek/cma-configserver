### Refresh the config server to pull changes from GIT

OLD version not working  
POST http://localhost:8088/actuator/bus-refresh

New Version working change /bus-refresh to /busrefresh  
POST http://localhost:8088/actuator/busrefresh  
it must be POST not GET so use postman or Talend
