multi-services project
> 多注册中心
> 
- provider端application.yml      consumer端的也一样

```yaml
dubbo:
  application:
    name: service
  registries:
    registry1:
      address: zookeeper://192.168.31.152:2181
    registry2:
      address: zookeeper://192.168.31.225:2181
  protocol:
    name: dubbo
    port: 20882
server:
  port: 8085
```

> [UserService.java](http://UserService.java)     UserController.java
> 

```java
//@DubboService 这里是重点  括号里的要填写
@DubboService(registry = {"registry1","registry2"})
@Component
public class BookServiceImpl implements BookService {
    /**
     * 获取书籍
     */
    @Override
    public String getBook() {
        return "hello";
    }
}

//UserController.java  
//@DubboReference(registry = "registry2")这里也要注意一下，填谁都行 
@RestController
@Slf4j
public class UserController {
    @DubboReference
    UserService userService;
    @DubboReference(registry = "registry2")
    BookService bookService;
    @GetMapping("/user")
    public String getUser(){
        log.info(userService.getUser());
        log.info(bookService.getBook());
        return userService.getUser()+bookService.getBook();
    }
}
```
