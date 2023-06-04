## Curso Microservices Spring Cloud

### :card_index_dividers: - Microservices:

##

:open_file_folder: projeto-cursoms
* :file_folder: eurekaserver <br />
* :file_folder: msavalidadorcredito <br />
* :file_folder: mscartoes <br />
* :file_folder: msclientes <br />
* :file_folder: mscloudgateway

##

### :gear: - Ferramentas: 

* Spring Boot 2.7 <br />
* Insomnia <br />
* RabbitMQ <br />
* Keycloack <br />
* Gateway

##

### :robot: - Tecnologias: 

* Java 11 e 17 <br />
* Docker <br />
* Git

##

### :card_index_dividers: - Arquitetura de Microservices: <br />

##

##### :rotating_light: - Milhões de usuários estão acessando a url de clientes das apis de microservice de clientes, causando congestionamento de requisições;

##### :white_check_mark: - A arquitetura construída serve para resolver esse problema, sendo acessado por uma única url de máquinas diferentes, cada uma responsável por uma função específica;

##

##### :pushpin: `Discovery Server:` É um componente que serve para registrar as instâncias, independente da porta, uma instância única e uma porta específica

##### :pushpin: `Load Balancer:` É uma junção entre Discovery Server e Gateway, fazendo o papel de balanceamento entre instâncias, designa a requisição do Gateway para uma porta especifica para distribuir igualmente entre todas as intâncias das requisições

##### :pushpin: `Gateway:` Serve de único ponto de acesso, fazendo a distribuição de requisições das instâncias

![mensageriaCurso1-Página-2 drawio](https://github.com/carloshenriquefs/curso-microservices-springcloud/assets/54969405/bf9baa01-c0b8-4fc6-b541-4b50367822da)

##

### :telephone_receiver: - Comunicação entre Microservices: <br />

##

##### :white_check_mark: - Serviço de mensageria que será repassado para os microservicos para a emissão de cartões de crédito;

##### :white_check_mark: - Uma fila de mensageria, é uma comunicação assincrona que pode receber mensagens, estando online ou offline, a fila estará presente até que alguém venha e consuma essa informação;

##### :white_check_mark: - Solicitando a informação, processando e cadastrando o cartão e assim salvando no banco de dados;

##

![mensageriaCurso1-Página-1 drawio (1)](https://github.com/carloshenriquefs/curso-microservices-springcloud/assets/54969405/e83b9888-29fe-44dc-ac0d-dea3a19b37d9)

##

### :page_with_curl: - Swagger:

##

##### :pushpin: - Documentação das API's

![avaliador](https://github.com/carloshenriquefs/curso-microservices-springcloud/assets/54969405/50c8e53b-5ec7-43a8-9e08-0797fa818323)
![cartoes](https://github.com/carloshenriquefs/curso-microservices-springcloud/assets/54969405/0dab0735-8373-42c6-9be9-bd02350bd88f)
![clientes](https://github.com/carloshenriquefs/curso-microservices-springcloud/assets/54969405/81041e76-5356-4311-976e-2e4e414b9178)

