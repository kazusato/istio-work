# Run monolith-app on Docker

```
$ cd monolith-app
$ sudo docker run --name monolith -p 8080:8080 -v $(pwd)/build/libs:/opt/payara5/deployments payara/server-full:5-SNAPSHOT
```
