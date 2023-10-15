package contracts.api.teacher.negative

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("""
Represents a successful scenario of getting teacher by id.

```
given:
  client requests teacher.
when:
  a valid request is submitted
then:
  response body is returned.
```

""")
    request {
        method 'PUT'
        url $(consumer(regex('/api/v1/teacher/[a-zA-Z0-9]{7}')), producer('/api/v1/teacher/smart50'))
        headers {
            contentType(applicationJson())
            accept(applicationJson())
        }
        body(file('positiveTeacher.json'))

    }
    response {
        status OK()
        body(file('positiveTeacher.json'))
    }
}

