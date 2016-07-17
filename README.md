# PWS-dead-simple-eureka-client
Simple Eureka client "app" for testing service registration in PWS with a deployed Eureka server app.

After creating the Eureka server app, these are the steps I followed to successfully get this discovery client app to register with the deployed Eureka app:

## Create the user-provided service from the app
cf cups eureka-service -p {"uri":"http://eureka-service-unassuageable-unkindliness.cfapps.io"}

## Bind the discovery client app to the Eureka server/service
cf bind-service dead-simple-eureka-client eureka-service

NOTE: No code/configuration I tried (and there were several, this being the latest) allowed the Eureka client app to register with the Eureka server. Creating the service & binding to it from the client app did.

