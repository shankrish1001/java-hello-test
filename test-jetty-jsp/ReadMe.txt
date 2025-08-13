Step-1:
docker build -t my-jetty-img .

Step-2:
docker run -d -p 8080:8080 --name jetty-hello my-jetty-img

Step-3:
http://localhost:8080/

