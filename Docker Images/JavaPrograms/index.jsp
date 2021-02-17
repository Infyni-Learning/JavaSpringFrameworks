FROM tomcat:alpine
ADD index.jsp /usr/local/tomcat/webapps/simpleApp/
CMD ["catalina.sh", "run"]