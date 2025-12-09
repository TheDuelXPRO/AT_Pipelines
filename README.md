README 
- O que foi feito

Criado Dockerfile e gerada imagem Docker.

Imagem publicada no Docker Hub.

Aplicação executada dentro de um container.

- Kubernetes

Criado Deployment com 2 réplicas.

Criado Service para expor a aplicação.

- Workflows GitHub Actions

hello.yml = imprime “Hello CI/CD”.

tests.yml = executa em pull request.

gradle-ci.yml = build na branch main.

env-demo.yml = usa variável de ambiente.

secret-demo.yml = usa secret.

release-deploy.yml = executa em release.

matrix = roda em Java 11 e 17.

deploy.yml = workflow final com ambientes e secrets.