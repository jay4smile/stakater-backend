# stakater-backend

To run this application follow below steps

checkout repository

**run `mvn clean install`**

Make sure you set NAME parameter as an environment variable

`mvn spring-boot:run`

Above command will start local application server on port 8080.

###### To run it with docker container, please follow below steps


`docker build --tag=stakater-backend:latest .`
`docker tag stakater-backend:latest jay4smile/stakater-backend:latest
`
`docker run -p 8080:8080 -e NAME='Stakater' jay4smile/stakater-backend`


Kubernates configuration:

`$ kubectl create deployment stakater-backend --image=jay4smile/stakater-backend --dry-run -o=yaml > deployment.yaml`

`$ kubectl create service clusterip stakater-backend --tcp=8080:8080 --dry-run -o=yaml >> service.yaml`

Apply kubernates yamls

`kubectl apply -f`

Check all pods

`kubectl get all `

Allow port forwarding so that service can be accessible

`kubectl port-forward svc/stakater-backend 8080:80`
