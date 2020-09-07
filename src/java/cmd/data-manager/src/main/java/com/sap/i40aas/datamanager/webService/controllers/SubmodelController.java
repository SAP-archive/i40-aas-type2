package com.sap.i40aas.datamanager.webService.controllers;

import com.sap.i40aas.datamanager.webService.services.SubmodelObjectsService;
import identifiables.Submodel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;
import utils.AASObjectsDeserializer;

import java.util.List;

@RestController
@Slf4j

public class SubmodelController {


  @Autowired
  private final SubmodelObjectsService submodelService;

  //need for mock testing
  public SubmodelController(SubmodelObjectsService submodelService) {
    this.submodelService = submodelService;
  }


  @GetMapping(value = "/submodels")
  public List<Submodel> getSubmodelsList() {

    log.info("List Submodels request");
    return submodelService.getAllSubmodels();


  }

  //use the params to filter by HTTP parameters
  @GetMapping(value = "/submodels", params = "id")
  public Submodel getSubmodels(@RequestParam(name = "id", required = false) String id) {

    return submodelService.getSubmodel(id);
  }

  @PutMapping("/submodels")
  public ResponseEntity createSubmodel(@RequestBody String body, @RequestParam("id") String id) throws DuplicateResourceException {

    log.debug("Received PUT /submodels with id " + id);

    //NOTE: we give String in @Requestbody otherwise it will be deserialized with Jackson. TODO: see if there are alternatives to this
    Submodel sb = AASObjectsDeserializer.Companion.deserializeSubmodel(body);
    Submodel createdSubmodel = submodelService.createSubmodel(id, sb);

    return new ResponseEntity<>(createdSubmodel, HttpStatus.CREATED);
  }

  @PatchMapping("/submodels")
  public ResponseEntity updateSubmodel(@RequestBody String body, @RequestParam("id") String id) throws MissingServletRequestParameterException {


    //NOTE: we give String in @Requestbody otherwise it will be deserialized with Jackson. TODO: see if there are alternatives to this
    Submodel sb = AASObjectsDeserializer.Companion.deserializeSubmodel(body);
    submodelService.updateSubmodel(id, sb);

    return new ResponseEntity<>(submodelService.createSubmodel(id, sb), HttpStatus.CREATED);

  }

  @PostMapping("/submodels")
  public void updateSubmodel(@RequestBody String body) {

    //NOTE: we give String in @Requestbody otherwise it will be deserialized with Jackson. TODO: see if there are alternatives to this
    Submodel sb = AASObjectsDeserializer.Companion.deserializeSubmodel(body);
    submodelService.addSubmodel(sb);
  }


  @DeleteMapping("/submodels")
  public void deleteSubmodel(@RequestParam("id") String id) {
    submodelService.deleteSubmodel(id);
  }
}
