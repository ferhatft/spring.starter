# **Kurulum**


**![](ekler/Pasted%20image%2020240226193434.png)**
* **`https://start.spring.io`  adresinden  ilgili Dependenci leri ekledikten sonra  install edilen dosyayı  idea da açıyoruz**

**![](../../ekler/Pasted%20image%2020240226193359.png)**

* **yeni Dependencies eklemek için  `mvnrepository.com` adresinden  ilgili versiyonu seçerek  `pom.xml `de `Dependenciy` kısmına ekleme yaptıktan sonra sağ üstte çıkan `load mavan changes` e tıklayarak sync etmek gerekir.**

**![](ekler/Pasted%20image%2020240226193535.png)**
* **spring in default port u `8080` dir bunu değiştirmek için `application.properties` de `server.port` bilgisini belirtebiliriz**

**![](ekler/Pasted%20image%2020240226193607.png)**
# **Controllers**

* **bir class ın `controller` olduğunu göstermek için `@RestController` `annatotion` kullanılır**
* Burada `endpoint` yönetimlerini yaparız
* mimarinin daha temiz olması için `controller` isminde yeni bir paket oluştururuz
* genelde `isimcontroller` şeklinde isimlendirilirler

## **Annotations**
* Bir clasın `controler` olduğunu spring e belirtmek  için `@RestController`  annotation u kullanılır
- **`@RequestMapping("url")` ile hangi url e cevap vereceğin belirtebiliriz**


```java
@GetMapping  
public String a(@RequestParam("abc") String name){  
    return  "Merhaba" + name;  
}

```

- `@GetMapping` ile gelen `GET` isteğini karşılarız

![](ekler/Pasted%20image%2020240227020005.png)


- `@RequestParam` ile  hangi parametre ile isteği alacağımızı belirtebiliriz

- `@GetMapping("get3")` şeklinde `@GetMapping()` içine bir değer eklediğimizde path e eklenir ve yeni path i okur
```java

@GetMapping("{page}")  
public String b(@PathVariable String page) {  
    return "Get Request " + page;  
}

```
- `@GetMapping("{page}")`  bu şekilde de dinamik bir yapı ile path i okur
  ![](ekler/Pasted%20image%2020240227021548.png)


- body den gelen verileri almak ve göndermek için `class` kullanılır
- `@RequestBody` ile gelen variable veya arraylare erişebilirz
```java
@PostMapping()  
public Response b(@RequestBody Request request){  
    Response response = new Response();  
    response.setGivenNumber(request.getNumber());  
    return response;  
}
```

`Response.java`

```java
package com.turkcell.spring.starter.controller;  
  
public class Response {  
  
    int givenNumber;  
  
    public int getNumber() {  
        return givenNumber;  
    }  
  
    public void setGivenNumber(int number) {  
        this.givenNumber = number;  
    }  
}
```

![](ekler/Pasted%20image%2020240227022821.png)