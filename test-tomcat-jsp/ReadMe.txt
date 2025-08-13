✅ Build the Docker Image
docker build -t tomcat-jsp-img .

✅ Run the Container
docker run -d -p 8080:8080 --name tomcat-test tomcat-jsp-img

✅ Run tomcat and check
http://localhost:8080/hello/

