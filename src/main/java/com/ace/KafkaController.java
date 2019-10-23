package com.ace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {


private final PersonService personService;

@Autowired
public KafkaController(PersonService personService) {
this.personService=personService;
}
	

@PostMapping(value = "/publish/person",consumes=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<Object> sendMessagePersonToKafkaTopic(@RequestBody Person person){
this.personService.sendPerson(person);

return new ResponseEntity<Object>(HttpStatus.OK);
}


}
