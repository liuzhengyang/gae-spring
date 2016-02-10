# gae-spring
It's Google AppEngine And Spring, Spring MVC.
Basically it's an image gallery.  
I am planning add one automate crawler to crawling images.   
And one request proxy for experiment.

# Status
Developing

# prerequisite
mvn  
java7+   


# Usage

### gallery
```
https://github.com/liuzhengyang/gae-spring   
cd java-proxy   
mvn appengine:devserver   
open browser in http://localhost:8080   
```

### request proxy
```
open http://localhost:8080/fetch?url=http://www.google.com
```

### deploy to your google app engine
Modify app id in src/main/webapp/WEB-INF/appengine-web.xml
Here is my demo [http://lzydemo1.appspot.com/](http://lzydemo1.appspot.com/)


