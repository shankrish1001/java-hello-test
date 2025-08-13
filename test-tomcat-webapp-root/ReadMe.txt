✅ Build the Docker Image
docker build -t tomcat-web-img .

✅ Run the Container
docker run -d -p 8080:8080 --name tomcat-test tomcat-web-img

✅ Run tomcat and check
http://localhost:8080/

