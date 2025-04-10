export DOCKER_BUILDKIT=1
docker build --platform linux/amd64 -t kubernetcontainerregistry.azurecr.io/balkan-date-pojo-models:latest .
docker push kubernetcontainerregistry.azurecr.io/balkan-date-pojo-models:latest