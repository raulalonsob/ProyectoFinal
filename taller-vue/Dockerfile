#La carpeta node_modules puede no copiarse incluyéndola en .dockerignore
FROM node:lts-alpine

RUN npm install -g http-server

WORKDIR /app

COPY package*.json ./

RUN npm install

COPY . .

RUN npm run build

EXPOSE 8081

CMD [ "http-server", "dist" ]

#Por ejemplo:
#docker build -t raulalonsob/taller
#docker run -d -p 8081:8080 --rm --name taller-front raulalonsob/taller