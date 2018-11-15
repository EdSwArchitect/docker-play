Playing around with Docker.

docker-services - Module for Docker stuff

    This contains the Docker stuff. 
        * consul directory contains a Consul service.
        * webbie contains a simple REST SpringBoot service that is a service client
        to Consul
        
    The consul container used from https://hub.docker.com/r/progrium/consul/
    
 simple-rest - Module for the simple rest service
 
    The jar file from this, is copied into the webbie directory and then do the Docker build stuff
    